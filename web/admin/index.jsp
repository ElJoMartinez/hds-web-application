<%-- 
    Document   : index
    Created on : Apr 17, 2017, 3:29:52 PM
    Author     : Elliot Martinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>Admin Dashboard</title>

        <!-- Bootstrap core CSS     -->
        <link href="/css/bootstrap.min.css" rel="stylesheet" />

        <!--  Material Dashboard CSS    -->
        <link href="/css/material-dashboard.css" rel="stylesheet"/>



        <!--     Fonts and icons     -->
        <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
        <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <div class="wrapper">
            <%@include file="/admin/admin_sidebar.jsp" %>
            <%@include file="/admin/admin_main.jsp" %>
           
