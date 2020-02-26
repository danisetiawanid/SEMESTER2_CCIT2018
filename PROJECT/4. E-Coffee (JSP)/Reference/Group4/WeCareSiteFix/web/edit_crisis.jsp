<%-- 
    Document   : edit_crisis
    Created on : Jul 1, 2019, 3:06:19 PM
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
         <title>Form Crisis</title>
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
        <form action="CrisisController?data=crisis&proses=update-crisis" method="post">
            <h3>Edit Crisis </h3>
      
            <table style="margin:20px auto;">
           <%
                String id_crisis = request.getParameter("id_crisis");
                CrisisModel km = new CrisisModel();
                km.setId_crisis(id_crisis);
                List<CrisisModel> data = new ArrayList<CrisisModel>();
                data = km.cariID_CRISIS(); 
                if (data.size() > 0) {

            %>
                    <p>Judul</p>
                    <p><input type="text" name="judul" value="<%=data.get(0).getJudul()%>"></p>
                    <p>Deskripsi</p>
                    <p><textarea name="deskripsi"><%=data.get(0).getDeskripsi()%></textarea></p>
                    <p> <select name="kategori"></p>
                    <option> <%=data.get(0).getKategori()%></option>
                    <option  name="kategori">Social Service</option>
                    <option  name="kategori">Natural Disaster</option></p>
                    <option  name="kategori">Social Building</option></p>
                    </select>
                    <p><input type="hidden" name="id_crisis" value="<%=data.get(0).getId_crisis()%>"></p>
                    
                    <tr>
                    <td><input type="submit"  class="btn btn-submit" value="Update"></td>
                    </tr>
                  <%}%>
            </table>
                  </div>
	</form>	
        </div>
    </body>
</html>
