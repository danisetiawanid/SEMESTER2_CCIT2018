<%-- 
    Document   : building
    Created on : Jun 30, 2019, 8:18:37 PM
    Author     : Haidar
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

  body {
    background-color: #FFF8DC;  
  }

  .container1{
  position: relative;
}


.logo1 {
  position: absolute;
  top: 8px;
  right: 54px;
  opacity: 0.8;

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

.linetop {
  position: absolute;
  top: 15px;
  right: 140px;
  width: 2.7%;
  opacity: 0.6;
}


#back {
  position: absolute;
  top: 80px;
  left: 225px;
  font-size: 24px;
  color: #130f40;
}
#myBtn {
  display: none;
  position: fixed;
  bottom: 20px;
  right: 50px;
  z-index: 99;
  font-size: 22px;
  border: none;
  outline: none;
  background-color: red;
  color: white;
  cursor: pointer;
  padding: 5px;
  border-radius: 7px;
}
#myBtn:hover {
  background-color: #130f40;
  color: #f9ca24;
}

#border1 {
  outline: 0rem;
  border-radius: 2px;
  margin-left: 100px; 
  margin-right: 1060px;
  box-shadow: 3px 3px 12px grey;
  position: absolute;
}

#border2 {
  outline: 0rem;
  border-radius: 2px;
  margin-left: 500px;
  margin-right: 660px; 
  box-shadow: 3px 3px 12px grey;
  position: absolute;
}

#border3 {
  outline: 0rem;
  border-radius: 2px;
  margin-left: 900px;
  margin-right: 260px; 
  box-shadow: 3px 3px 12px grey;
  position: absolute;
}

 

a {
  text-decoration: none;
  color: #130f40;
}
a:hover{
  color: #dfe6e9;
}

p {
  font-family: Brandon Grotesque;
  font-size: 20px;
  line-height: 1.6;
}
.dropdown {
  display: inline-block;
  position: absolute;
  left: 74%;
  top: 30%;
}
.dd-button {
  display: inline-block;
  border: 1px solid grey;
  border-radius: 3px;
  padding: 10px 30px 10px 20px;
  background-color: #000000;
  cursor: pointer;
  white-space: nowrap;
}
.dd-button:after {
  content: '';
  position: absolute;
  top: 50%;
  right: 30px;
  transform: translateY(-50%);
  width: 0; 
  height: 0; 
  border-left: 5px solid transparent;
  border-right: 5px solid transparent;
  border-top: 5px solid white;
}
.dd-button:hover {
  background-color: darkgrey;
}
.dd-input {
  display: none;
}
.dd-menu {
  position: absolute;
  top: 100%;
  border: 1px solid #ccc;
  border-radius: 4px;
  padding: 0;
  margin: 2px 0 0 0;
  box-shadow: 0 0 3px 0 rgba(0,0,0,9);
  background-color: #ffffff;
  list-style-type: none;
}
.dd-input + .dd-menu {
  display: none;
} 
.dd-input:checked + .dd-menu {
  display: block;
} 
.dd-menu li {
  padding: 10px 20px;
  cursor: pointer;
  white-space: nowrap;
}
.dd-menu li:hover {
  background-color: #f6f6f6;
}
.dd-menu li a {
  display: block;
  margin: -10px -20px;
  padding: 10px 20px;
}
.dd-menu li.divider{
  padding: 0;
  border-bottom: 1px solid #cccccc;
}

  </style>
</head>


<body>

<div class="container1">


  <div class="logo1"> <a href="wecare.jsp"> <img src="images/care-logo-b.png" alt="logo" width="55%"> </a> </div>
    <div class="linetop"> <img src="images/small-line-b.png" alt="line" width="100%"> </div> <!-- HOME -->
      <div class="aboutus"> <a href="aboutus.jsp">about us</a></div> <!-- ABOUT US -->
      <div class="donasi"><a href="donate.jsp"><b>donation</b></a></div>
  </div>

<br>

<h1 style="margin-left:160px; margin-top:200px; font-size:30px; color:#130f40; line-height:1;"> <b>Love is when you care about the situation<br>being faced by someone with the same concern<br>as your own situation.<b><br><b style="font-family:helcetica; font-size:22px;"><i>-Morrie Schwartz</i></b></h1>

<label class="dropdown">
  <div class="dd-button" style="color:#ffffff;">
    Categories
  </div>
  <input type="checkbox" class="dd-input" id="test">
  <ul class="dd-menu">
    <li>
      <a href="sosial.jsp">Social Service</a>
    </li>
    <li>
      <a href="natural.jsp">Natural Disaster</a>
    </li>
    <li>
      <a href="building.jsp">Social Building</a>
    </li>
    <li class="divider"></li>
    
  </ul>
  
</label>

 
<br>
<br><br><br><br>

<div id="border1" >
  <a href="sekolah.jsp"><img src="images/foto4.jpg" alt="Social Building" height="auto" width="100%">
        <h5 style="font-size:22px; color:#130f40; margin-left:15px; line-height:30px;"><b>Unilala Elementary School</b></h5>
        <h5 style="font-size:18px; color:#000000; margin-left:15px; margin-bottom:10px">One of the very common notions ...</h5>
    </div>
</div>

<div id="border2" >
  <a href="masjid.jsp"><img src="images/foto12.jpg" alt="Social Building" height="auto" width="100%">
        <h5 style="font-size:22px; color:#130f40; margin-left:15px; line-height:30px;"><b>Village Masjid Need Help</b></h5>
        <h5 style="font-size:18px; color:#000000; margin-left:15px; margin-bottom:10px">The man was seen crying and said ...</h5>
        
    </div>

<div id="border3" >
  <a href="church.jsp"><img src="images/foto14.jpg" alt="Social Building" height="auto" width="100%">
        <h5 style="font-size:22px; color:#130f40; margin-left:15px; line-height:30px;"><b>Silo Ambroben Building Church</b></h5>
        <h5 style="font-size:18px; color:#000000; margin-left:15px; margin-bottom:10px">GKI SILO AMBROBEN is the oldest ...</h5>
        
    </div>
    <br><br><br><br><br><br><br><br><br><br><br><br><br><br>  
    <div id="border1" >
  <a href="masjid1.jsp"><img src="images/foto15.jpg" alt="Social Building" height="auto" width="100%">
        <h5 style="font-size:22px; color:#130f40; margin-left:15px; line-height:30px;"><b>Construction of Al-Istiqomah Mosque</b></h5>
        <h5 style="font-size:18px; color:#000000; margin-left:15px; margin-bottom:10px">Introducing My Name is Adi Cahyadi ...</h5>
        
    </div>
<div id="border2" >
  <a href="hospital.jsp"><img src="images/foto18.jpg" alt = "Social Building" height="auto" width="100%">
        <h5 style="font-size:22px; color:#130f40; margin-left:15px; line-height:30px;"><b>Indonesian Hospital in Palestine</b></h5>
        <h5 style="font-size:18px; color:#000000; margin-left:15px; margin-bottom:10px">Thousands of Palestinians need ...</h5>
        
    </div>
  
<div id="border3" >
  <a href="sekolah1.jsp"><img src="images/foto21.jpg" alt = "Social Building" height="auto" width="100%">
        <h5 style="font-size:22px; color:#130f40; margin-left:15px; line-height:30px;"><b>SMPN 3 Waigete Back to School</b></h5>
        <h5 style="font-size:18px; color:#000000; margin-left:15px; margin-bottom:10px">Waigete Junior High School is ...</h5>
        
    </div>

  <br><br><br>

<div style="opacity:0.4; margin-top:25%; margin-left:23.7%;"><h5 style="font-size:21px; color:#130f40;">Find us on :</h5></div>


  <div style="position: absolute; margin-left:23.7%; font-size:22px; font-weight:normal"><a href="https://www.facebook.com" target="_blank">Facebook</a></div>
  <div style="position: absolute; margin-left:33%; font-size:22px; font-weight:normal"><a href="https://www.twitter.com" target="_blank">Twitter</a></div>
  <div style="position: absolute; margin-left:41%; font-size:22px; font-weight:normal"><a href="https://www.instagram.com" target="_blank">Instagram</a></div>
  <div style="position: absolute; margin-left:51%; font-size:22px; font-weight:normal"><a href="https://line.me/en/" target="_blank">LINE</a></div>  
  
<br><br><br><br>

  <div><p style="font-weight:normal; margin-left:23.7%; font-family: raleway; position:absolute; font-size:18px;">&copy <b>2019 We Care Site</b> |</p></div>
  <div><a href="wecare.jsp"><p style="font-weight:normal; margin-top:2.5px; font-size:16px; margin-left:36.5%; font-family:raleway; position:absolute;">Privacy & Terms</p></a></div>

<!--SSSCCCCRRRIIIPPTTTTTT-->
  <button onclick="topFunction()" id="myBtn" title="Go to top">^</button>

<script>
// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    document.getElementById("myBtn").style.display = "block";
  } else {
    document.getElementById("myBtn").style.display = "none";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}
</script>
<!--SSSCCCCRRRIIIPPTTTTTT-->

</body>
</html>