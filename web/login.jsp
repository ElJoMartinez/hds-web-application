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
</div>

</body>
</html>