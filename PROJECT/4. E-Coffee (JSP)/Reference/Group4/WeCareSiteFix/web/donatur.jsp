<%-- 
    Document   : donatur
    Created on : Jun 30, 2019, 9:03:54 PM
    Author     : Martin Noverardi
--%>



<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.DonaturModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Donatur</title>
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
                <a  href="DonaturController?proses=input-donatur"><button class="btn btn-tambah">Tambah Data</button></a>
            </div>
            <table class="data">
              <tr>
                  <th>No</th>
                  <th>Name</th>
                  <th>Phone</th>
                  <th>Action</th>
              </tr>
              <%
                  DonaturModel km = new DonaturModel();
                  List<DonaturModel> data = new ArrayList<DonaturModel>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                 <td><center><%=x + 1%></td>
                      
                         <td><center><%=data.get(x).getNama_donatur()%></td>
                         <td><center><%=data.get(x).getPhone()%></td>
                  
                  <td>
                  <center>   <a href="DonaturController?proses=edit-donatur&id_donatur=<%=data.get(x).getId_donatur()%>" class="btn btn-edit">Edit</a>
                      <a href="DonaturController?proses=hapus-donatur&id_donatur=<%=data.get(x).getId_donatur()%>" class="btn btn-hapus">Hapus</a>
                  </td>
              </tr>
              <%}%>
          </table>
              
</body>
</html>