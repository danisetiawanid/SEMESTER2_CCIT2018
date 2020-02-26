<%-- 
    Document   : tambah_donatur
    Created on : Jun 30, 2019, 9:01:18 PM
    Author     : Martin Noverardi
--%>

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
                        

        <form action="DonaturController?data=donatur&proses=input-donatur" method="post">
            <table style="margin:20px auto;">
                
                     <p>Phone</p>
                    <p><input type="number" name="phone"></p>
                    
                    <p>Name</p>
                    <p><input type="text" name="nama_donatur"></p>
		
		<tr>
                    
                    <td><input type="submit" value="Tambah"></td>
		</tr>
            </table>
	</form>	
        </div>
        </div>
    </body>
</html>