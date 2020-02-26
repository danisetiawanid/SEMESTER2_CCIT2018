<%-- 
    Document   : sakit
    Created on : Jun 30, 2019, 8:26:48 PM
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
<h1><center id="title" style="">Medicine Needs</center></h1>
<br>
<center><img src="images/foto9.jpg" height="auto" width="35%" style=""></center>
<br>
<br>
 <div class="container">
    <div class="row">
      <div class="" style=" margin-left:2%; color:#130f40;">
        <article style="font-size:20px">Children experience a drug crisis. Come on, save thousands of patients, to be free from the torments of painful torture! The increase in the number of patients and their needs in hospitals cannot be fulfilled, due to the decrease in assistance from international humanitarian organizations and institutions.<br><br>As a result, pediatric patients including cancer patients cannot receive treatment because they are very short of chemotherapy drugs. The health system consisting of 13 public hospitals and 14 clinics managed by NGOs has been in a state of extreme shortcomings due to the constant tight blockade. Lack of drugs and supplies of surgical equipment.<br><br>From the results of intense International communication and coordination with international partners in the relevant regions, it was found that at least 1,000 patients in scattered hospitals were unable to receive the medicines needed for their health recovery. With an estimated cost of around USD 10 per patient.
You can contribute so that the little good you channel can save thousands of children to be healthy and play again by "clicking donation, and input the nominal donation."

 </article>
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
<script>
  var title = document.getElementById
  ("title").textContent;sessionStorage.
    setItem('title',title);
</script>
</body>

</html>
