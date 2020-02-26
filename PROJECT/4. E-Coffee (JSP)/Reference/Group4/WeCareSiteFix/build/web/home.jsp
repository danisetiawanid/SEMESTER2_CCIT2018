<%-- 
    Document   : home
    Created on : Jun 29, 2019, 8:37:50 AM
    Author     : Martin Noverardi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>We Care Site Admin</title>
    <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <div class="container clearfix">
        <h1>We Care Site</h1>
        <div class="content">
            <div class="btn-tambah-div">
                <br>
                
            <center>
            <h1>
            <%
            String a=session.getAttribute("username").toString();
            out.println("Hello,  "+a );
            %>
            </h1>
            </center>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            
            
            <center><img src="images/logo-black.png" style="width:35%; margin-right:-10%; margin-top:-200px">
            </center>
            </div>
            </div>
        <div class="sidebar">
            <ul>
                <li><a href="home.jsp">Dashboard</a></li>
                <li><a href="crisis.jsp">Crisis Data</a></li>
                <li><a href="donation.jsp">Donation Data</a></li>
                <li><a href="donatur.jsp">Donatur Data</a></li>
                <li><a href="metode.jsp">Payment Data</a></li>
                <li><a href="login.jsp">Logout</a></li>
            </ul>
        </div>
    </body>
</html>
