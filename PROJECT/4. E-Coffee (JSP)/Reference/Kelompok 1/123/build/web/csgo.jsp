<%-- 
    Document   : event
    Created on : Jun 29, 2019, 11:09:19 AM
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
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="fontawesome-free-5.8.2-web/css/all.css">

    <script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script type="text/javascript" src="js/bootstrap.bundle.js"></script>
 
  <link rel="icon" type="image/jpg" href="img/fazee.png">

    <title>Faze Clan : CSGO</title>

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
  width: 40%; /* Could be more or less, depending on screen size */
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
   <a href="homer.jsp">
    <img src="img/faze.jpg" width="100%" ></a>
  <div class="collapse navbar-collapse ml-5" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link " href="homer.jsp">Home <span class="sr-only"></span></a>
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Division
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="Fortnite.jsp"><img src="img/fortnite.png" width="20%"> Fortnite</a>
          <a class="dropdown-item" href="csgo.jsp"><img src="img/cesgo.png" width="20%"> CSGO</a>
          <a class="dropdown-item" href="fifa.jsp"><img src="img/ball.png" width="20%"> FIFA</a>
          <a class="dropdown-item" href="pubg.jsp"><img src="img/pabji.png" width="20%"> PUBG</a>
          <a class="dropdown-item" href="COD.jsp"><img src="img/codss.png" width="20%"> Call of Duty</a>
          <a class="dropdown-item" href="R6.jsp"><img src="img/r666.png" width="20%">  RainbowSix</a>
        </div>
      </li>
      <a class="nav-item nav-link" href="event.jsp">Schedule</a>
         <a class="nav-item nav-link" href="gallery.jsp">Gallery</a>
   
    </div>
  </div>
           <a onclick="document.getElementById('id01').style.display='block'" style="float:right;" class="Tambah"> <img src="img/acc.jpg"></a>
 <div id="id01" class="modal">
  <form class="modal-content animate" action="Login?proses=login" method="post">
    
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>

      <div class="container">
          <label for="uname"><b>Email</b></label>
      <input type="text" placeholder="Enter Email" name="email" required>

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="password" required>
      <p>Dont Have Acount? Register <a href="regist.jsp" style="color:blue">Here!</a></p> 
      <button type="submit" >LogIn</button>
  
      </div>
    </form>
      </div>
  </div>
</nav>
</head>

<body>
<br>
<br>
<br>
<br>
  <img src="img/csgos.jpg" width="99.99%">

 <div class="container">
  <div class="row mt-5">
    <div class="col">
<div class="bd-example">
  <h1 align="center">INTRODUCTION</h1>
  <p class="solid"></p>
<p>
    FaZe Clan first came onto the scene with the acquisition of the roster of G2 Esports back in January 2016. The team's first tournament under FaZe would be at DreamHack Leipzig 2016, where they would start in Group A up against Gabriel "FalleN" Toledo's Luminosity Gaming in a Best-of-one. Their first match of the tournament would go well for the Europeans, with a 16-9 victory on Inferno, with Håvard "rain" Nygaard top-fragging with an HLTV rating of 1.64.
   </p>

  <p>
    The next match for the team would be against Danylo "Zeus" Teslenko's Natus Vincere, who were the favourites of Group A. This match-up would not go as well for FaZe, as the team would be completely shut out by enemy AWPer Ladislav "GuardiaN" Kovács, and would end the match with a reverse scoreline of the previous match-up, finishing 9-16 on Train.
  </p>

  <p>
    After losing their previous match, the deciding factor between moving on and going home would lie within a rematch with the Brazilians of Luminosity Gaming, this time in a Best-of-three. The first map would go poorly for FaZe, bombing out on Train with a 7-16 scoreline. However, the next map would go even worse for the Europeans, on Cache they would end the map early against Luminosity Gaming and finishing 5-16. This would mark a 5-6th group stage finish and an earning of $3,000, as the team was no match against opposing Marcelo "coldzera" David's stellar performance.
  </p>

<p class="solid"></p>
   <h1 align="center">TEAM MEMBER</h1>
   <p class="solid"></p>

<p>
  <div  class="hideme">
<img src="img/niko.jpg"  width="50%" align="left" />
<br>
<h5>Nickname : NIKO</h5>
<h5>Name : Nikola Kovač</h5>
<h5>Age : 22</h5>
<h5>Role : Fragger</h5>
<h5>Country : <img src="img/BA.gif"> Bosnia and Herzegovina</h5>
</div>
</p>

<br>
<br>
<br>
<br>
<br>

<p>
<div  class="hideme">
<img src="img/rain.jpg"  width="50%" align="left" />
<br>
<h5>Nickname : RAIN</h5>
<h5>Name : Håvard Nygaard</h5>
<h5>Age : 24</h5>
<h5>Role : Fragger</h5>
<h5>Country : <img src="img/NO.gif"> Norway</h5>
</div>
</p>


<br>
<br>
<br>
<br>
<br>

<p>
<div  class="hideme">
<img src="img/olof.jpg"  width="50%" align="left" />
<br>
<h5>Nickname : OLOFMEISTER</h5>
<h5>Name : Olof Kajbjer</h5>
<h5>Age : 27</h5>
<h5>Role : Fragger</h5>
<h5>Country : <img src="img/SE.gif"> Sweden</h5>
</div>
</p>

<br>
<br>
<br>
<br>
<br>

<p>
<div  class="hideme">
<img src="img/guardian.jpg"  width="50%" align="left" />
<br>
<h5>Nickname : GUARDIAN</h5>
<h5>Name : Ladislav Kovács</h5>
<h5>Age : 27</h5>
<h5>Role : Sniper</h5>
<h5>Country : <img src="img/SK.gif"> Slovakia</h5>
</div>
</p>

<br>
<br>
<br>
<br>
<br>

<p>
<div  class="hideme">
<img src="img/neo_1.jpg"  width="50%" align="left" />
<br>
<h5>Nickname : NEO</h5>
<h5>Name : Filip Kubski</h5>
<h5>Age : 31</h5>
<h5>Role : Captain</h5>
<h5>Country : <img src="img/PL.gif"> Poland</h5>
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
