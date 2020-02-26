<%-- 
    Document   : dashboard
    Created on : Jul 1, 2019, 7:13:55 PM
    Author     : arfan
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.UserModel"%>
<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
   <link rel="icon" type="image/jpg" href="img/fazee.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Faze Clan : Dashboard
  </title>
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
       }
       .dropdown-menu {
        background-color: #ff3636;
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
    .main {
  margin-left: 270px; /* Same as the width of the sidenav */
  font-size: 15px; /* Increased text to enable scrolling */
  padding: 0px 10px;
}     
         

</style>
</head>

<body class="">
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
          <li class="active ">
            <a href="dashboard.jsp">
              <i class="now-ui-icons design_app"></i>
              <p>Dashboard</p>
            </a>
          </li>
         
         <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdownMenuLink"  data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="now-ui-icons design_bullet-list-67"></i> Table
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <a class="dropdown-item" href="registadmin.jsp"><i class="now-ui-icons users_single-02"></i><p style="color:white"> User</p></a>
            <a class="dropdown-item" href="index.jsp"><i class="now-ui-icons ui-1_check"></i><p style="color:white"> Vote</p></a>
            <a class="dropdown-item" href="schedule.jsp"><i class="now-ui-icons location_map-big"></i><p style="color:white">Event</p></a>
         <a class="dropdown-item" href="contactdash.jsp"><i class="now-ui-icons files_single-copy-04"></i><p style="color:white">Contact</p></a>
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
      <div class="main">
            
              <h1>Welcome <%=session.getAttribute("name")%> !</h1>
              <br>
              <center>
              <img src="img/fazeSASA.png">
              </center>
             
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
</body>

</html>