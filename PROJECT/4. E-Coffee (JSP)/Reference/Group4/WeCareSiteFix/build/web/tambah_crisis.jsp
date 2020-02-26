<%-- 
    Document   : tambah_crisis
    Created on : Jun 29, 2019, 12:49:02 PM
    Author     : Martin Noverardi
--%>

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
                        

        <form action="CrisisController?data=crisis&proses=input-crisis" method="post">
            <table style="margin:20px auto;">
                
                     <p>Judul</p>
                    <p><input type="text" name="judul"></p>
                    
                    <p>Deskripsi</p>
                    <p><textarea name="deskripsi"></textarea></p>
                    
                    <p>Kategori</p>
                    <p> <select name="kategori">Crisis Category</p>
                    <option  name="kategori">Social Service</option>
                    <option  name="kategori">Natural Disaster</option></p>
                    <option  name="kategori">Social Building</option></p>
                    </select>
		<tr>  
                    <td><input type="submit" value="Tambah"></td>
		</tr>
            </table>
	</form>	
        </div>
        </div>
    </body>
</html>
  