<%-- 
    Document   : edit_donatur
    Created on : Jun 30, 2019, 9:54:45 PM
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
         <title>Form Donatur</title>
    <link rel="stylesheet" href="style.css">
    </head>
    <body>
         <div class="container clearfix">
        <h1>We Care</h1>
          <div class="sidebar">
            <ul>
                <li><a href="">Crisis Data</a></li>
                <li><a href="">Donation Data</a></li>
                <li><a href="">Donatur Data</a></li>
                <li><a href="">Payment Data</a></li>
                <li><a href="logout.php">Logout</a></li>
            </ul>
        </div>
        <div class="content">
        <form action="DonaturController?data=donatur&proses=update-donatur" method="post">
            <h3>Edit Donatur </h3>
      
            <table style="margin:20px auto;">
           <%
                String id_donatur = request.getParameter("id_donatur");
                DonaturModel km = new DonaturModel();
                km.setId_donatur(id_donatur);
                List<DonaturModel> data = new ArrayList<DonaturModel>();
                data = km.cariID_DONATUR(); 
                if (data.size() > 0) {

            %>
            <p>Phone</p>
                    <p><input type="number" name="phone" value="<%=data.get(0).getPhone()%>"></p>
                    <p>Name</p>
                    <p><input type="text" name="nama_donatur" value="<%=data.get(0).getNama_donatur()%>"></p>
                    <p><input type="hidden" name="id_donatur" value="<%=data.get(0).getId_donatur()%>"></p>
                    <td><input type="submit"  class="btn btn-submit" value="Update"></td>
		
                  <%}%>
            </table>
                  </div>
	</form>	
        </div>
    </body>
</html>
