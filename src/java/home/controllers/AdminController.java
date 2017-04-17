
package home.controllers;

/**
 *
 * @author Elliot Martinez
 */

import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import home.business.*;
import home.data.*;
import static home.data.ProductDB.selectProducts;
public class AdminController extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        String requestURI = request.getRequestURI();
        String url = "/admin";
        if (requestURI.endsWith("/displayInvoices")) {
            url = displaySalesRecords(request, response);
        } else if (requestURI.endsWith("/processInvoice")) {
            url = processSalesRecord(request, response);
        } else if (requestURI.endsWith("/displayReport")) {
            displayReport(request, response);
        } else if (requestURI.endsWith("/displayInvoices2")) {
            url = displaySalesRecords(request, response);
        } else if (requestURI.endsWith("/productMaintanence")) {
            url = displayProducts(request, response);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        String requestURI = request.getRequestURI();
        String url = "/admin";
        if (requestURI.endsWith("/displayInvoice")) {
            url = displaySalesRecords(request, response);
        } else if (requestURI.endsWith("/displayInvoices")) {
            url = displaySalesRecords(request, response);
        } else if (requestURI.endsWith("/productMaintanence")) {
            url = displayProducts(request, response);
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    private String displaySalesRecords(HttpServletRequest request,
            HttpServletResponse response) {
     
        String url;
        url = "/admin/salesrecords.jsp";
        return url;
    }
    
    private String processSalesRecord(HttpServletRequest request,
            HttpServletResponse response) {
        String url;
        url = "/adminController/displaySalesRecords";
        return url;
    }
    
    private void displayReport(HttpServletRequest request,
            HttpServletResponse response)  {
        
    }
    
    private String displayProducts(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        String url;
        url = "/admin/index.jsp";
        return url;
    }
    
}
