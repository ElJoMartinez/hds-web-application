<jsp:include page="/includes/header.jsp" />
<div class="wrapper">
    <div class="header header-filter"  id="header-img-login">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                    <div class="card card-signup" id="login-card">
                        <form class="form" action="j_security_check" method="post">
                            <div class="header  text-center" id="card-head">
                                <h4 class="card-title">Log In</h4>
                            </div>
                            <div class="card-content" id="card-content" >
                                <div class="input-group" id="input">
                                    <span class="input-group-addon">
                                        <i class="material-icons">face</i>
                                    </span>
                                    <input name="j_username" type="text" class="form-control" placeholder="Username..." >
                                </div>  
                                <div class="input-group" id="input">
                                    <span class="input-group-addon">
                                        <i class="material-icons">lock</i>
                                    </span>
                                    <input name="j_password" type="password" class="form-control" placeholder="Password..." >
                                </div> 
                                <button type="submit"  class=" btn btn-default" id="login-button">Login</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Start footer Section -->
    <footer class="footer" id="login-footer">
        <div class="container">
            <nav>
                <ul>
                    <li>
                        <a href="/inventory/showinventory">
                            Inventory
                        </a>
                    </li>
                    <li>
                        <a href="/about.jsp">
                            About Us
                        </a>
                    </li>
                    <li>
                        <a href="/faqs.jsp">
                            FAQs
                        </a>
                    </li>
                    <li>
                        <a href="/contact.jsp">
                            Contact
                        </a>
                    </li>
                    <li>
                        <a href="/services.jsp">
                            Services 
                        </a>
                    </li>
                </ul>
            </nav>
            <div class="copyright pull-right">
                &copy; 2016, made with <i class="fa fa-heart heart"></i> by Creative Tim: Template
            </div>
        </div>
    </footer>
    <!-- End Footer Section -->

    <!--   Core JS Files   -->
    <script src="/js/jquery.min.js" type="text/javascript"></script>
    <script src="/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="/js/material.min.js" type="text/javascript"></script>

    <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
    <script src="/js/nouislider.min.js" type="text/javascript"></script>

    <!--  Plugin for the Datepicker, full documentation here: http://www.eyecon.ro/bootstrap-datepicker/ -->
    <script src="/js/bootstrap-datepicker.js" type="text/javascript"></script>

    <!-- Control Center for Material Kit: activating the ripples, parallax effects, scripts from the example pages etc -->
    <script src="/js/material-kit.js" type="text/javascript"></script>


</div>

</body>
</html>