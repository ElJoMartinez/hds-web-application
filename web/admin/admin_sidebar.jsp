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
        <a href="/admincontroller/showCustomers" class="simple-text">
            Welcome Admin
        </a>
    </div>


    <div class="sidebar-wrapper">
        <ul class="nav">
            <li class="active">
                <a href="dashboard.html">
                    <i class="material-icons">person</i>
                    <p>Customers</p>
                </a>
            </li>
            <li>
                <a href="#">
                    <i class="material-icons">person</i>
                    <p>Sales Records</p>
                </a>
            </li>
            <li>
                <a href="#">
                    <i class="material-icons">content_paste</i>
                    <p>Products</p>
                </a>
            </li>
            <li>
                <a href="typography.html">
                    <i class="material-icons">library_books</i>
                    <p>Typography</p>
                </a>
            </li>
            <li>
                <a href="icons.html">
                    <i class="material-icons">bubble_chart</i>
                    <p>Icons</p>
                </a>
            </li>
            <li>
                <a href="maps.html">
                    <i class="material-icons">location_on</i>
                    <p>Maps</p>
                </a>
            </li>
            <li>
                <a href="notifications.html">
                    <i class="material-icons text-gray">notifications</i>
                    <p>Notifications</p>
                </a>
            </li>
            <li class="active-pro">
                <a href="upgrade.html">
                    <i class="material-icons">unarchive</i>
                    <p>Upgrade to PRO</p>
                </a>
            </li>
        </ul>
    </div>
</div>
