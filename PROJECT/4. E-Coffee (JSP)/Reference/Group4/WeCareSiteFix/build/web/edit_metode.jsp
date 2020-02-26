<%-- 
    Document   : edit_metode
    Created on : Jun 29, 2019, 7:50:37 AM
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
         <title>Form Payment</title>
    <link rel="stylesheet" href="style.css">
    </head>
    <body>
         <div class="container clearfix">
        <h1>We Care</h1>
          <div class="sidebar">
            <ul>
                <li><a href="crisis.jsp">Crisis Data</a></li>
                <li><a href="donasi.jsp">Donation Data</a></li>
                <li><a href="donatur.jsp">Donatur Data</a></li>
                <li><a href="metode.jsp">Payment Data</a></li>
                <li><a href="logout.php">Logout</a></li>
            </ul>
        </div>
        <div class="content">
        <form action="MetodeController?data=metode&proses=update-metode" method="post">
            <h3>Edit Payment Methode</h3>
      
            <table style="margin:20px auto;">
           <%
                String id_pembayaran = request.getParameter("id_pembayaran");
                MetodeModel km = new MetodeModel();
                km.setId_pembayaran(id_pembayaran);
                List<MetodeModel> data = new ArrayList<MetodeModel>();
                data = km.cariID_PEMBAYARAN(); 
                if (data.size() > 0) {

            %>

                    <p><input type="text" name="metode" value="<%=data.get(0).getMetode()%>"></p>
                    <p><input type="hidden" name="id_pembayaran" value="<%=data.get(0).getId_pembayaran()%>"></p>
                    <td><input type="submit"  class="btn btn-submit" value="Update"></td>
		
                  <%}%>
            </table>
                  </div>
	</form>	
    
    </body 
</html>