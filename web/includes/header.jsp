<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>

<html>
    <head>
        <meta charset="utf-8">
        <title>Home Design Solutions</title>
        <link rel="shortcut icon" href="<c:url value='/icons/favicon.ico'/>">
        <link rel="stylesheet" href="<c:url value='css/bootstrap.min.css'/>">
        <link rel="stylesheet" href="<c:url value='css/material-kit.css'/>">  
        <link rel="stylesheet" href="<c:url value='css/main.css'/> ">
        <link href="https://fonts.googleapis.com/css?family=Cantarell|Old+Standard+TT|Quicksand:500" rel="stylesheet">
        <link rel="stylesheet" href="<c:url value='https://fonts.googleapis.com/icon?family=Material+Icons'/>" />
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
    </head>

    <body>
        <nav class="navbar navbar-transparent navbar-absolute">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/">
                        <div class="logo">
                            <img src="<c:url value='/images/hdslogo.png'/>" width='60' height='60' />
                            <p>Home Design Solutions</p>
                        </div>
                    </a>
                </div>

                <div class="collapse navbar-collapse" id="navigation-example">
                    <ul class="nav navbar-nav navbar-right">
                        <!-- Link Name -->
                        <li>
                            <a href="../components-documentation.html" target="_blank">
                                Components
                            </a>
                        </li>
                        <li <c:if test="${pageContext.request.servletPath == '/index.jsp'}">class="current"</c:if>>
                            <a href="<c:url value='/index.jsp'/>">Home</a>
                        </li>
                        
                    </ul>
                </div>

            </div>
        </nav>
        <div class="wrapper">
            <div class="header header-filter"  id="header-img">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6" id="header_text">
                            <h1 class="title">Write the best title for your page.</h1>
                            <h4>Every landing page needs a small description after the big bold title, that's why we added this text here. Add here all the information that can make you or your product create the first impression.</h4>
                            <br />
                            
                        </div>
                    </div>
                </div>
            </div>	
        </div>
