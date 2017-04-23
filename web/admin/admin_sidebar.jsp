<%-- 
    Document   : admin_sidebar
    Created on : Mar 11, 2017, 4:31:12 PM
    Author     : toillezenitram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="sidebar" data-color="blue" data-image="/images/sidebar-1.jpg">
    <!--
Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"
Tip 2: you can also add an image using data-image tag

    -->
    <div class="logo">
        <a href="/admincontroller/index.jsp" class="active simple-text">
            Welcome Admin
        </a>
    </div>


    <div class="sidebar-wrapper">
        <ul class="nav">
            <li>
                <a href="/admincontroller/showCustomers" >
                    <i class="material-icons">person</i>
                    <p>Customers</p>
                </a>
            </li>
            <li>
                <a href="/admincontroller/displaySalesRecords">
                    <i class="material-icons">content_paste</i>
                    <p>Sales Records</p>
                </a>
            </li>
            <li>
                <a href="/admincontroller/showEmployees">
                    <i class="material-icons">people</i>
                    <p>Employees</p>
                </a>
            </li>
            <li>
                <a href="/admincontroller/logout">
                    <i class="material-icons">backspace</i>
                    <p>Logout</p>
                </a>
            </li>
            
        </ul>
    </div>
</div>
