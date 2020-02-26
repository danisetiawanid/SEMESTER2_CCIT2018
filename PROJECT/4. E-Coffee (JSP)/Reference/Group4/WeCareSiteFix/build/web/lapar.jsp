<%-- 
    Document   : lapar
    Created on : Jun 30, 2019, 8:22:56 PM
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
link-button{
  text-decoration: none;
  color: black;
  padding: 2px 6px 2px 6px;
  border: 5px solid #c2c2c2;
  border-radius: 2px;
}


input[type=text], input[type=number] {
	margin: 5px auto;
	width: 100%;
	padding: 10px;
}
input[type=submit]{
	margin: 5px auto;
	float: center;
	padding: 5px;
	width: 90px;
	border: 1px solid #fff;
	color: #fff;
	background: red;
	cursor: pointer;
  margin-left: 150px;
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

  .container1{
  position: relative;
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
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<h1><center id="title" style="">Somalia Starvation</center></h1>
<br>
<center><img src="images/lapar.png" height="auto" width="35%" style=""></center>
<br>
<br>
 <div class="container">
    <div class="row">
      <div class="" style=" margin-left:2%; color:#130f40;">
        <h5 style="fon2t-size:18px">Today the world is shocked by the famine that has taken place in Somalia. Somali Prime Minister Hassan Khaire (4/3/2017), announced that in just 48 hours this bad condition has killed 110 people in the Bay region as quoted by Al Jazeera. Drought that has resulted in a food crisis in Somalia has received international attention, including Indonesia. The crisis that has also hit several countries on the African continent since the beginning of March 2017 has killed more than 100 people.<br><br>Hunger in Somalia was declared a "national disaster" by President Mohamed Abdullahi Mohamed. He even expressed his encouragement to other countries to help his country. UN Secretary General Antonio Guterres said Somalia needed funding assistance from the international community, "We need financial support from the international community. A total of US $ 825 million for 5.5 million people in 6 months. If this is not fulfilled, then the tragedy will come, "Guterres said.<br><br>In 2011, as many as 260,000 people had died from famine in Somalia. Besides Somalia, South Sudan and Nigeria also experienced the same thing. The United Nations says 4,000 children in Nigeria suffer from malnutrition.<br><br>Natural factors, especially rain that has not fallen for months, are compounded by armed conflict and outbreaks of cholera that have spread in some areas, which are allegedly one of the causes.<br><br>It's time to give the best help. Let's help Somalis and Kenyans get out of the hunger crisis!
 </h5>
        </div>
    </div>
  </div>
  </div>
  <br>
  <br>
<center> <button style="font-size:25px; background:grey; color: white;" onclick="window.location.href='donate1.jsp'">donate</button> </center>


<div style="opacity:0.4; margin-top:25%; margin-left:23.7%;"><h5 style="font-size:21px; color:#130f40;">Find us on :</h5></div>


  <div style="position: absolute; margin-left:23.7%; font-size:22px; font-weight:normal"><a href="https://www.facebook.com" target="_blank">Facebook</a></div>
  <div style="position: absolute; margin-left:33%; font-size:22px; font-weight:normal"><a href="https://www.twitter.com" target="_blank">Twitter</a></div>
  <div style="position: absolute; margin-left:41%; font-size:22px; font-weight:normal"><a href="https://www.instagram.com" target="_blank">Instagram</a></div>
  <div style="position: absolute; margin-left:51%; font-size:22px; font-weight:normal"><a href="https://line.me/en/" target="_blank">LINE</a></div>  
  
<br><br><br><br>

  <div><p style="font-weight:normal; margin-left:23.7%; font-family: raleway; position:absolute; font-size:18px;">&copy <b>2019 We Care Site</b> |</p></div>
  <div><a href="file:///C:/Users/Haidar/Desktop/We%20Care/We%20Care.html"><p style="font-weight:normal; margin-top:2.5px; font-size:16px; margin-left:36.5%; font-family:raleway; position:absolute;">Privacy & Terms</p></a></div>

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
<script>
  var title = document.getElementById
  ("title").textContent;sessionStorage.
    setItem('title',title);
</script>
</body>
</html>
