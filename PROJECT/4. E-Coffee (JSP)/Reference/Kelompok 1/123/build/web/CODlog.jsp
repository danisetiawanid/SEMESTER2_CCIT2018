<%-- 
    Document   : COD
    Created on : Jun 29, 2019, 11:13:31 AM
    Author     : arfan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <style >
      p.groove {border-style: groove;}
      p.solid {border-style: solid;}
    </style>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
     <link rel="stylesheet" type="text/css" href="fontawesome-free-5.8.2-web/css/all.css"/>

    <script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script type="text/javascript" src="js/bootstrap.bundle.js"></script>
 
 <link rel="icon" type="image/jpg" href="img/fazee.png">
  

    <title>Faze Clan : COD</title>

   <style type="text/css">
      .dropdown-item{
  background-color:  black;
  color: white;
       }
       .dropdown-menu {
        background-color: black;
       }


        @font-face {
         font-family: "Font Digital";
         src: url('font/pubg.ttf');
         }
 
        @font-face {
         font-family: "Font foot";
         src: url('font/SoccerLeague.ttf');
         }
 
   h1{
         font-family: "Font Digital";
         font-size: 3.5rem;
         }

    h2{
      font-family: "Font foot";
    }

   h3{
         font-family: "Font Digital";
         font-size: 1.5rem;
         color: #fff;
         }

    @font-face {
         font-family: "Font nav";
         src: url('font/Voltage.otf');
         }

      a{
        font-family: "Font nav";
        font-size: 1.5rem;
      }
      input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

/* Set a style for all buttons */
button {
  background-color: black;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  position: relative;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
  padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}

/* Add Zoom Animation */
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
    </style>



<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-primary">
  <div class="container">
   <a href="logged.jsp">
    <img src="img/faze.jpg" width="100%" ></a>
  <div class="collapse navbar-collapse ml-5" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link " href="logged.jsp">Home <span class="sr-only">(current)</span></a>
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Division
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="Fortnitelog.jsp"><img src="img/fortnite.png" width="20%"> Fortnite</a>
          <a class="dropdown-item" href="csgolog.jsp"><img src="img/cesgo.png" width="20%"> CSGO</a>
          <a class="dropdown-item" href="fifalog.jsp"><img src="img/ball.png" width="20%"> FIFA</a>
          <a class="dropdown-item" href="pubglog.jsp"><img src="img/pabji.png" width="20%"> PUBG</a>
          <a class="dropdown-item" href="CODlog.jsp"><img src="img/codss.png" width="20%"> Call of Duty</a>
          <a class="dropdown-item" href="R6log.jsp"><img src="img/r666.png" width="20%">  RainbowSix</a>
        </div>
      </li>
      <a class="nav-item nav-link" href="eventlog.jsp">Schedule</a>
         <a class="nav-item nav-link" href="gallerylog.jsp">Gallery</a>
      <a class="nav-item nav-link" href="contactlog.jsp">Contact Us</a>
       <a class="nav-item nav-link" href="voting.jsp">YouVote</a>
      </div>
  </div>
            <a class="nav-item nav-link " href="homer.jsp" style="color:grey"> LogOut</a>

      
      </div>
    </form>
  
      </nav>
</head>

<body>
<br>
<br>
<br>
<br>



  <img src="img/cods.jpg" width=99.99%>

  <br>

<div class="container">
  <div class="row mt-5">
    <div class="col">
<div class="bd-example">
  
  <h1 align="center">INTRODUCTION</h1>
  <p class="solid"></p>
<p>
  Call of Duty is the first division that faze have.FaZe Clan first got into competitive by sponsoring a few of NAMELESS's teams at events during the MW3 season. The notably won The Iowa Pro Gaming Challenge 2012.
   </p>

  <p>
    Their first roster was created consisting of Heist, Folsom, Secretly, and Sham to compete at the MLG Winter Championship.The team's expectations were unclear however their fans came in large numbers due to the base they already built. Their next roster was Heist, Methodz, Replays, and MBoZe. The team didn't end up winning, however they finished a respectable 5th place and took home $2,300 at the event. Despite this, the roster got a complete makeover going into UMG Atlanta as only Replays stayed to be joined by Slacked, Huhdle, and SpaceLy. Despite the new look, the team struggled to get any momentum. After dropping to the losers bracket following a loss to vVv Gaming in Round 4. Facing the tough task of going through the losers bracket to win the event, the team fell to Curse finishing in a very disappointing 9th place. Even with the sub par performance, the team decided to stick with the same roster going into the MLG PAX Prime Invitational. The team was able to make to the semifinals of the 8 team invitational, however that is where they were eliminated by eventual 2nd place finisher, compLexity Gaming. To close out Black Ops 2, the team attended the 4 team MLG Fall Invitational. The team once again kept the same roster but was unable to break the slump as they finished a disappointing 4th place and winning no money to end the game.
  </p>
  <p class="solid"></p>
     <h1 align="center">TEAM MEMBER</h1>
<p class="solid"></p>
<br>

  <p>
    <div  class="hideme">
<img src="img/ZooMaa.jpg"  width="50%" align="left" />
<br>
<h5>Nickname : ZOOMAA</h5>
<h5>Name : Thomas Paparatto</h5>
<h5>Age : 23</h5>
<h5>Role :  SMG Slayer</h5>
<h5>Country : <img src="img/USA.png"> United States</h5>
</div>
</p>

<br>
<br>
<br>
<br>
<br>

<p>
<div  class="hideme">
<img src="img/zer0.jpg"  width="50%" align="left" />
<br>
<h5>Nickname : ZER0</h5>
<h5>Name : Trei Morris</h5>
<h5>Age : 21</h5>
<h5>Role : Main AR</h5>
<h5>Country : <img src="img/Uk.png"> United Kingdom</h5>
</div>
</p>

<br>
<br>
<br>
<br>
<br>

<p>
<div  class="hideme">
<img src="img/Cellium.jpg"  width="50%" align="left" />
<br>
<h5>Nickname : CELLIUM</h5>
<h5>Name : McArthur Jovel</h5>
<h5>Age : 18</h5>
<h5>Role : AR Slayer</h5>
<h5>Country : <img src="img/USA.png"> United States</h5>
</div>
</p>

<br>
<br>
<br>
<br>
<br>
<br>

<p>
<div  class="hideme">
<img src="img/asim.jpg"  width="50%" align="left" />
<br>
<h5>Nickname : ASIM</h5>
<h5>Name : Obey Asim</h5>
<h5>Age : 21</h5>
<h5>Role : SMG Slayer</h5>
<h5>Country : <img src="img/Ca.png"> Canada</h5>
</div>
</p>

<br>
<br>
<br>
<br>
<br>

<p>
<div  class="hideme">
<img src="img/Skrapz.jpg"  width="50%" align="left" />
<br>
<h5>Nickname : SKRAPZ</h5>
<h5>Name : Matthew Marshall</h5>
<h5>Age : 21</h5>
<h5>Role : AR Slayer</h5>
<h5>Country : <img src="img/Uk.png"> United Kingdom</h5>
</div>
</p>

<br>
<br>
<br>
<br>
<br>

</div>
</div>
</div>
</div>





 <footer class="bg-danger text-white">
  <br><br><br>
    <div class="container">
  <div class="row justify-content-center">
      <div class="col-md-4">
  
   
      <img src="img/fazebot.png" width="25%">
    </div>

    <div class="col-md-4">
    <h2 align="center">OUR PARTNERS</h2>
   <p class="solid">
      <img src="img/scuf.png" width="25%">
      <img src="img/gfuel.png" width="25%">
      <img src="img/steel.png" width="25%">
      <img src="img/Nissan.png" width="15%">
     </p>
    </div>
    <div class="col-md-4">
      <h2 align="center">FOLLOW US</h2>
     <CENTER>
      <a href="https://twitter.com/FaZeClan"><i class="fab fa-twitter"></i></a>
      <a href="https://www.instagram.com/fazeclan/"><i class="fab fa-instagram"></i></a>
      <a href="https://www.facebook.com/TheFaZeClan"><i class="fab fa-facebook"></i></a>
      <a href="https://www.youtube.com/user/FaZeClan"><i class="fab fa-youtube"></i></a>
    </CENTER> 
    </div>
    </div> 
    </div>
    <br><br><br>
 </footer>










</body>
</html>
