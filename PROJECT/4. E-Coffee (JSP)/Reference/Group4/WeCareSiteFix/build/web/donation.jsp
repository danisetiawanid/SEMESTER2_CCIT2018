<%-- 
    Document   : donation
    Created on : Jul 3, 2019, 8:11:19 PM
    Author     : Martin Noverardi
--%>


<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.DonationModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crisis</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
    <div class="container clearfix">
        <h1>We Care Site</h1>
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
         <div class="content">
            <div class="btn-tambah-div"> 
            </div>
             <br>
             <br>
        <table class="data">
              <tr>
                  <th>Judul</th>
                  <th>Name</th>
                  <th>Phone</th>
                  <th>Amount</th>
                  <th>Payment</th>
                  <th>Messsage</th>
              </tr>
              <%
                  DonationModel km = new DonationModel();
                  List<DonationModel> data = new ArrayList<DonationModel>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><center><%=data.get(x).getJudul()%></td>
                  <td><center><%=data.get(x).getNama_donatur()%></td>
                   <td><center><%=data.get(x).getPhone()%></td>
                   <td><center><%=data.get(x).getJumlah()%></td>
                   <td><center><%=data.get(x).getMetode()%></td>
                   <td><center><%=data.get(x).getPesan()%></td>   
              </tr>
              <%}%>
          </table>
              
</body>
</html>