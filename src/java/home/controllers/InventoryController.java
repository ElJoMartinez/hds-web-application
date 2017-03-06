
package home.controllers;

/**
 *
 * @author Elliot Martinez
 * Change log: 2/17/17 - added basic servlet skeleton
 */

import java.io.File;
import java.io.IOException;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import home.business.*;
import home.data.*;
import home.util.CookieUtil;


public class InventoryController extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String url;
        if (requestURI.endsWith("/listen")) {
            url = "";
        }else if (requestURI.endsWith("/showinventory")) {
            url = showInventory(request, response);
        }else {
            url = showProduct(request, response);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
            
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String url = "/inventory";
        if (requestURI.endsWith("/register")) {
            url = registerUser(request, response);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
   
    private String registerUser(HttpServletRequest request,
            HttpServletResponse response) {

        HttpSession session = request.getSession();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        if (UserDB.emailExists(email)) {
            UserDB.update(user);
        } else {
            UserDB.insert(user);
        }

        session.setAttribute("user", user);

        Cookie emailCookie = new Cookie("emailCookie", email);
        emailCookie.setMaxAge(60 * 60 * 24 * 365 * 2);
        emailCookie.setPath("/");
        response.addCookie(emailCookie);
        
        Product product = (Product) session.getAttribute("product");
        String url = "/catalog/" + product.getSerialId() + "/sound.jsp";
        return url;
    }
    
    // Method returns in a response the url to the inventory jsp
    private String showInventory(HttpServletRequest request,
            HttpServletResponse response) {
        List<Product> products = ProductDB.selectProducts();
        request.setAttribute("products", products);
        String url = "/inventory/index.jsp";
        return url;
    }
    
     private String showProduct(HttpServletRequest request, 
            HttpServletResponse response) {
        

        return "/catalog/catalogitem.jsp";
    }
}
