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
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Faze | Player Table</title>
        
        <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
   <link rel="icon" type="image/jpg" href="img/fazee.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
  <!-- CSS Files -->
  <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
  <link href="assets/css/now-ui-dashboard.css?v=1.3.0" rel="stylesheet" />
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="assets/demo/demo.css" rel="stylesheet" />
  
  <style>
        .dropdown-item{
  background-color:  #ff3636;
  color: white;
       }
       .dropdown-menu {
        background-color: #ff3636;
       }
body {font-family: Arial, Helvetica, sans-serif;}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 70%;
  padding: 5px 10px;
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
  width: 35%; /* Could be more or less, depending on screen size */
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
  width: 100%;
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
.main {
  margin-left: 270px; /* Same as the width of the sidenav */
  font-size: 15px; /* Increased text to enable scrolling */
  padding: 0px 10px;
}
p {
    color:  white;
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
</style>
    </head>
    <body>
       
        <div class="wrapper ">
             
    <div class="sidebar" data-color="red">
      <!--
        Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red | yellow"
    -->
      <div class="logo">
        <a href="dashboard.jsp" class="simple-text logo-mini">
          <img type="image/jpg" src="img/fazebot.png" width="100%">
        </a>
        <a href="dashboard.jsp" class="simple-text logo-normal">
          Faze Clan
        </a>
      </div>
      <div class="sidebar-wrapper" id="sidebar-wrapper">
        <ul class="nav">
                 <li>        
            <a href="dashboard.jsp">
              <i class="now-ui-icons design_app"></i>
              <p>Dashboard</p>
            </a>
            </li>
            
         <li class="nav dropdown active">
        <a class="nav-link dropdown-toggle " href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" >
          <i class="now-ui-icons design_app design_bullet-list-67"></i> Table
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <a class="dropdown-item" href="registadmin.jsp"><i class="now-ui-icons users_single-02"></i><p> User</p></a>
            <a class="dropdown-item" href="index.jsp"><i class="now-ui-icons ui-1_check"></i><p> Vote</p></a>
            <a class="dropdown-item" href="schedule.jsp"><i class="now-ui-icons location_map-big"></i><p>Event</p></a>
           <a class="dropdown-item" href="contactdash.jsp"><i class="now-ui-icons files_single-copy-04"></i><p>Contact</p></a>
        </div>
      </li>
         <li>
       <a href="homer.jsp">
              <i class="now-ui-icons media-1_button-power"></i>
              <p>Log Out</p>
            </a>
      </li>
        </ul>
      </div>
    </div>
            
     
      <!-- Navbar -->
     
      <!-- End Navbar -->

  <!--   Core JS Files   -->
  <script src="assets/js/core/jquery.min.js"></script>
  <script src="assets/js/core/popper.min.js"></script>
  <script src="assets/js/core/bootstrap.min.js"></script>
  <script src="assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
  <!-- Chart JS -->
  <script src="assets/js/plugins/chartjs.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="assets/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="assets/js/now-ui-dashboard.min.js?v=1.3.0" type="text/javascript"></script>
  <!-- Now Ui Dashboard DEMO methods, don't include it in your project! -->
  <script src="assets/demo/demo.js"></script>
  <script>
    $(document).ready(function() {
      // Javascript method's body can be found in assets/js/demos.js
      demo.initDashboardPageCharts();

    });
  </script>
  
  <div class="main">
        <center>
            <button onclick="document.getElementById('id01').style.display='block'" style="width:auto;" class="Tambah">Tambah</button>
    </center>
  
    <div id="id01" class="modal">
  <form class="modal-content animate" action="UserController?data=user&proses=input-user" method="post">
    
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
    
    </div>
      <div class="container">
          <label for="nama"><b>Name</b></label>
      <input type="text" placeholder="Enter Username" name="nama" required>
      <br>
       <label for="divisi"><b>Division : </b></label>
      <select name="divisi">
  <option value="CSGO">CSGO</option>
  <option value="RaibowSix">RainbowSix</option>
  <option value="Fortnite">Fortnite</option>
  <option value="CallOfDuty">CallOfDuty</option>
   <option value="Fifa">Fifa</option>
    <option value="PUBG">PUBG</option>
    </select>
        
      
      <label for="vote"><b>Vote</b></label>
      <input type="number" min="1" max="9"  step="1" placeholder="Enter Vote" name="vote">
       
      
        
      <button type="submit" >Tambah</button>
  
      </div>
    </form>
      </div>

    


    <h2>Vote Table</h2>

<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for event.." title="Type in a event">

<table id="myTable">
  <tr class="header">
     <th style="width:40%;">No</th>
    <th style="width:60%;">Name</th>
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
                      
    <a href="VoteController?proses=edit-user&player_id=<%=data.get(x).getId()%>" data-toggle="modal"  class='li-modal'><button>Update</button></a>
      <br>
             

              
      <a href="VoteController?proses=hapus-user&player_id=<%=data.get(x).getId()%>"><button>Hapus</button></a>
      

            
            
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
</body>
</html>
