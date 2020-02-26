<%-- 
    Document   : crisis
    Created on : Jun 29, 2019, 12:47:57 PM
    Author     : Martin Noverardi
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.CrisisModel"%>
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
                <br>
        <a  href="CrisisController?proses=input-crisis" class = "btn btn-tambah">Tambah</a>
            </div>
             <br>
             <br>
        <table class="data">
              <tr>
                  <th>Judul</th>
                  <th>Deskripsi</th>
                  <th>Kategori</th>
                  <th>Action</th>
              </tr>
              <%
                  CrisisModel km = new CrisisModel();
                  List<CrisisModel> data = new ArrayList<CrisisModel>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><center><%=data.get(x).getJudul()%></td>
                  <td><center><%=data.get(x).getDeskripsi()%></td>
                   <td><center><%=data.get(x).getKategori()%></td>
                    <td>
                    <center> <a href="CrisisController?proses=edit-crisis&id_crisis=<%=data.get(x).getId_crisis()%>" class="btn btn-edit">Edit</a><br><br>
                         <a href="CrisisController?proses=hapus-crisis&id_crisis=<%=data.get(x).getId_crisis()%>" class="btn btn-hapus">Hapus</a>
                  </td>
              </tr>
              <%}%>
          </table>
              
</body>
</html>
