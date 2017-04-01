
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
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String requestURI = request.getRequestURI();
        String url = "";
        
        if (requestURI.endsWith("/showinventory")) {
            url = showInventory(request, response);
        }
        System.out.println(url);
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String requestURI = request.getRequestURI();
        String url = "";
        if (requestURI.endsWith("/showinventory")) {
            url = showInventory(request, response);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
   
    private String registerUser(HttpServletRequest request,
            HttpServletResponse response) {

        HttpSession session = request.getSession();
        return "/index.jsp";
    }
    
    // Method returns in a response the url to the inventory jsp
    private String showInventory(HttpServletRequest request,
            HttpServletResponse response) {
        
        String url = "/inventory/index.jsp";
        return url;
    }
    
     private String showProduct(HttpServletRequest request, 
            HttpServletResponse response) {
        List<Product> products = ProductDB.selectProducts();
        request.setAttribute("products", products);

        return "/inventory/inventoryitem.jsp";
    }
}
