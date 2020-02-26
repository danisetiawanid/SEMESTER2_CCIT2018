<%-- 
    Document   : wecare
    Created on : Jun 26, 2019, 9:02:11 PM
    Author     : Martin Noverardi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donate - We Care Site :)</title>
        <link rel="stylesheet" href="normalize.css">
  <link rel="stylesheet" href="skeleton.css">
  <link rel="icon" type="image/png" href="images/care.png">
   <style>
.container1{
  position: relative;
}

.logo1 {
  position: absolute;
  top: 8px;
  right: 100px;
  width: 3.6%;
  opacity: 0.8;
}

.linetop {
  position: absolute;
  top: 15px;
  right: 140px;
  width: 2.7%;
  opacity: 0.6;
}

.aboutus {
  position: absolute;
  top: 25px;
  right: 175px;
  font-size: 20px;
  color: white;
  line-height: 1.1;
}
.donasi{
  position: absolute;
top: 25px;
right: 270px;
font-size: 20px;
color: white;
line-height: 1.1;
}

a {
  text-decoration: none;
  color: #FFFFFF;
}
a:hover{
  color: #a4b0be;
}

.facebook{
  position: absolute; 
  width: 3%;
  margin-left: 590px;
}
.twitter{
  position: absolute;
  width: 3%;
  margin-left: 690px;
}
.instagram{
  position: absolute;
  width: 3%;
  margin-left: 790px;
}
.line{
  position: absolute;
  width: 3%;
  margin-left: 890px;
}

img { 
  width: 100%;
  height: auto;
}
</style>
    </head>
    <body>
     <div class="container1">

  <img src="images/people.jpg" alt="people"> <!-- Background -->

  <div class="logo1"> <a href="wecare.jsp"> <b><img src="images/care-logo.png" alt="logo"></b> </a> </div>
    <div class="linetop"> <img src="images/small-line.png" alt="line"> </div>
      <div class="aboutus"> <a href="aboutus.jsp">about us</a></div> <!-- GO TO ABOUT US PAGE -->
      <div class="donasi"><a href="donate.jsp">donation</b></a></div>
  </div>

 <div class="container">
    <div class="row">
      <div class="twelve column" style="margin-top:-60%; color:white">
        <div style="width:15%"><img src="images/logo-white.png"></div>
        <h4>"we share what they need"</h4>
        <p>We Care Site is a website of caring and social service for people in need with donation features which will then be channeled to people or communities who need the donation.</p>
      
        	
            <form method="post" action="donate.jsp">
        		<input type =  "submit" value = "DONATE" style="color:white" > <!-- GO TO DONATE PAGE -->
        	</form>
      </div>
    </div>
  </div>
  

  <div style="text-align: center; margin-top: 50px"> <h3>Find us on :</h3></div>
  <br>

  <div class="facebook"><a href="https://www.facebook.com" target="_blank"> <img src="images/facebook.png" alt="facebook"> </a></div>
  <div class="twitter"><a href="https://www.twitter.com" target="_blank"> <img src="images/twitter.png" alt="twitter"> </a></div>
  <div class="instagram"><a href="https://www.instagram.com" target="_blank"> <img src="images/instagram.png" alt="instagram"> </a></div>
  <div class="line"><a href="https://line.me/en" target="_blank"> <img src="images/line.png" alt="line"> </a></div>
  <br>
  <br>
  <br>
  <br><br><br><br><br>

  <div style="background-color: #57606f; opacity:0.8; padding: 35px;">
  <div style="text-align: center; color: white; margin-top: 30px"> <h3>Contact us!</h3></div>
  <div style="text-align: center; color: white; margin-top: 50px;"> <h6 style="font-size:18px"/>+62 87885852822 (Haidar)</h6></div>
  <div style="text-align: center; color: white; margin-top: -20px"> <h6 style="font-size:18px">+62 87719021760 (Raka)</h6></div>
  <br><br><br>
   <p style="font-weight:normal; font-family: raleway; position:absolute; margin-top:2.6px; color:white; ">&copy <b>2019 We Care Site</b> |</p>
    <div><a href="wecare.jsp"><p style="font-weight:normal; font-size:16px; margin-top:2px;margin-left:10.9%; font-family: raleway; position:absolute;">Privacy & Terms</p></div>

</body>
</html>

