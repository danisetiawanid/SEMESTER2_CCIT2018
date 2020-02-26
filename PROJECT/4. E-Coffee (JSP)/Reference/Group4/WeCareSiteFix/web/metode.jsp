<%-- 
    Document   : index
    Created on : Jun 28, 2019, 11:01:24 PM
    Author     : Martin Noverardi
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.MetodeModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Payment Method</title>
    <link rel="stylesheet" href=    "style.css">
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
                <a  href="MetodeController?proses=input-metode">
                    <button class="btn btn-tambah">Tambah Data</button></a>
            </div>
            <table class="data">
              <tr>
                  <th>No</th>
                  <th>Metode</th>
                  <th>Pilihan</th>
              </tr>
              <%
                  MetodeModel km = new MetodeModel();
                  List<MetodeModel> data = new ArrayList<MetodeModel>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><center><%=x + 1%></td>
                  <td><center><%=data.get(x).getMetode()%></td>
                  
                  <td>
                  <center> <a href="MetodeController?proses=edit-metode&id_pembayaran=<%=data.get(x).getId_pembayaran()%>" class="btn btn-edit">Edit</a>
                      <a href="MetodeController?proses=hapus-metode&id_pembayaran=<%=data.get(x).getId_pembayaran()%>" class="btn btn-hapus">Hapus</a>
                  </td>
              </tr>
              <%}%>
          </table>
              
</body>
</html>

