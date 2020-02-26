<%-- 
    Document   : tambah_metode
    Created on : Jun 28, 2019, 11:03:40 PM
    Author     : Martin Noverardi
--%>

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
            <h3>Add Payment Methode</h3>
        <form action="MetodeController?data=metode&proses=input-metode" method="post">
            <table style="margin:20px auto;">
		
                <p><input type="text" name="metode"></p>
                
		
		<tr>
                    
                    <td><input type="submit" class="btn btn-submit" value="Save"></td>
		</tr>
            </table>
	</form>	
    
    </body>
</html>
