<%-- 
    Document   : admin_footer
    Created on : Mar 11, 2017, 5:04:01 PM
    Author     : Elliot Martinez
--%>


<footer class="footer">
    <div class="container-fluid">
        <nav class="pull-left">
            <ul>
                <li>
                    <a href="/">
                        Home
                    </a>
                </li>
                </div>
                </footer>

                </div>
                </div>
                
                </body>

                <!--   Core JS Files   -->
                <script src="/js/jquery-3.1.0.min.js" type="text/javascript">
                    $(document).ready(function () {
    $('.nav li a').click(function(e) {

        $('.nav li').removeClass('active');

        var $parent = $(this).parent();
        if (!$parent.hasClass('active')) {
            $parent.addClass('active');
        }
        e.preventDefault();
    });
});

                </script>
                <script src="/js/bootstrap.min.js" type="text/javascript"></script>
                <script src="/js/material.min.js" type="text/javascript"></script>

                <!--  Charts Plugin -->
                <script src="/js/chartist.min.js"></script>

                <!--  Notifications Plugin    -->
                <script src="/js/bootstrap-notify.js"></script>

                <!--  Google Maps Plugin    -->
                <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js"></script>

                <!-- Material Dashboard javascript methods -->
                <script src="/js/material-dashboard.js"></script>

                </html>