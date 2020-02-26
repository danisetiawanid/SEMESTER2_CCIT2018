<%-- 
    Document   : index
    Created on : Nov 20, 2016, 12:39:11 PM
    Author     : PH4NTHOM
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.UserModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
      
        <style >
      p.solid {border-style: solid;}
      p.groove {border-style: groove;}
    </style>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="fontawesome-free-5.8.2-web/css/all.css">
  <link rel="icon" type="image/jpg" href="img/fazee.png">

    <title>Faze Clan : Vote!</title>
    
        <style>
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
body {font-family: Arial, Helvetica, sans-serif;}

/* Full-width input fields */
input[type=text], input[type=password], input[type=number] {
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
  width: 20%; /* Could be more or less, depending on screen size */
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

        <style>
* {
  box-sizing: border-box;
}

#myInput {
  background-image: url('/css/searchicon.png');
  background-position: 10px 10px;
  background-repeat: no-repeat;
  width: 100%;
  font-size: 16px;
  padding: 12px 20px 12px 40px;
  border: 1px solid #ddd;
  margin-bottom: 12px;
}

#myTable {
  border-collapse: collapse;
  width: 70%;
  border: 1px solid #ddd;
  font-size: 18px;
}

#myTable th, #myTable td {
  text-align: left;
  padding: 12px;
}

#myTable tr {
  border-bottom: 1px solid #ddd;
}

#myTable tr.header, #myTable tr:hover {
  background-color: #f1f1f1;
}

</style>
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
    </head>
    <body>

 
 <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
  <div class="container">
  <a href="logged.jsp">
    <img src="img/faze.jpg" width="100%" ></a>
  <div class="collapse navbar-collapse ml-5" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link " href="logged.jsp">Home</a>
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
        
      <a class="nav-item nav-link " href="contactlog.jsp">Contact Us  <span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link active " href="voting.jsp">YoUVote</a>
    </div>
  </div>
    
        <a class="nav-item nav-link " href="homer.jsp" style="color:grey"> LogOut</a>
  </div>
</nav>       
      

        <br>
        <br>
        <br>
        <br>
        <br>
       
     
        <center>
       <h2>Vote Table</h2>



<table id="myTable">
  <tr class="header">
     <th style="width:40%;">No</th>
    <th style="width:40%;">Name</th>
    <th style="width:40%;">Divisi</th>
    <th style="width:40%;">Vote</th>
     <th style="width:40%;">Action</th>
  </tr>
              <%
                  UserModel km = new UserModel();
                  List<UserModel> data = new ArrayList<UserModel>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getNama()%></td>
                  <td><%=data.get(x).getDivisi()%></td>
                  <td><%=data.get(x).getVote()%></td>
                  <td>
                      

              
    <a href="UserController?proses=votes-user&player_id=<%=data.get(x).getId()%>" data-toggle="modal"  class='li-modal'><button>Vote</button></a>
      <br>
                  </td>
              </tr>
              <%}%>
          </table>
          
          
                   </div>
        </div>
              <div id="theModal" class="modal fade text-center">
    <div class="modal-dialog">
      <div class="modal-content" style="width: 100%">
      </div>
    </div>
  </div>
                <script>
    $('.li-modal').on('click', function(e){
      e.preventDefault();
      $('#theModal').modal('show').find('.modal-content').load($(this).attr('href'));
    });
  </script>
          <br><br><br>
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
