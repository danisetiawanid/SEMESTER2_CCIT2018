<%-- 
    Document   : index
    Created on : Nov 20, 2016, 12:39:11 PM
    Author     : PH4NTHOM
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeladmin.UserModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Faze | Player</title>
               <style>
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
input[type=text], input[type=password] {
  width: 60%;
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
  width: 30%; /* Could be more or less, depending on screen size */
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
.containers {
  padding: 16px;
  background-color: white;
}
</style>

<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: "Lato", sans-serif;
}

.sidenav {
  height: 100%;
  width: 160px;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  padding-top: 20px;
}

.sidenav a {
  padding: 6px 8px 6px 16px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
}

.sidenav a:hover {
  color: #f1f1f1;
}

.main {
  margin-left: 160px; /* Same as the width of the sidenav */
  font-size: 28px; /* Increased text to enable scrolling */
  padding: 0px 10px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
</style>
    </head>
    <body>
        <div class="sidenav">
  <a href="index.jsp">Player Table</a>
  <a href="registadmin.jsp">User Table</a>
  <a href="#clients">Clients</a>
  <a href="#contact">Contact</a>
</div>

<div class="main">
        <center>
            <button onclick="document.getElementById('id01').style.display='block'" style="width:auto;" class="Tambah">Add Players</button>
    </center>
  <div class="containers">
    <div id="id01" class="modal">
  <form class="modal-content animate" action="UserController?data=user&proses=input-userss" method="post">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
    </div>
      <div class="container">
          <label for="nama"><b>Name : </b></label>
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
        
      <button type="submit" value="Tambah">Add</button>
  
      </div>
    </form>
      </div>
  </div>
    
    <h2>Players Table</h2>

<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for event.." title="Type in a event">

<table id="myTable">
  <tr class="header">
     <th style="width:40%;">No</th>
    <th style="width:40%;">Name</th>
    <th style="width:40%;">Divisi</th>
     <th style="width:40%;">Action</th>
  </tr>
              <%
                  UserModel km = new UserModel();
                  List<UserModel> data = new ArrayList<UserModel>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                     for (int x = 0; x < data.size(); x++) 
                  {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getNama()%></td>
                  <td><%=data.get(x).getDivisi()%></td>
                  <td>                     
                      
                      
                      <button onclick="document.getElementById('id02').style.display='block'" style="width:auto;" class="Tambah">Update</button>
                                           <div id="id02" class="modal">
  <form class="modal-content animate" action="UserController?data=user&proses=update-userss"  method="post">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="faze.jpg" alt="Avatar" class="avatar">
    </div>
           <div class="container">
          <label for="nama"><b>Name</b></label>
      <input type="text" placeholder="Enter Username" name="nama" value="<%=data.get(0).getNama()%>">

      <label for="divisi"><b>Division</b></label>
       <select name="divisi">
  <option value="CSGO">CSGO</option>
  <option value="RaibowSix">RainbowSix</option>
  <option value="Fortnite">Fortnite</option>
  <option value="CallOfDuty">CallOfDuty</option>
   <option value="Fifa">Fifa</option>
    <option value="PUBG">PUBG</option>
    </select>
      <input type="hidden" name="player_id" value="<%=data.get(0).getId()%>">
        
      <button type="submit" value="Update">Update</button>
  
      </div>
    </form>
      </div>
      
      <a href="UserController?proses=hapus-userss&player_id=<%=data.get(x).getId()%>"><button>Delete</button></a>
      
      
                      <%
                String player_id = request.getParameter("player_id");
                UserModel am = new UserModel();
                am.setId(player_id);
                  List<UserModel> datas = new ArrayList<UserModel>();
                datas = am.cariID(); 
                if (datas.size() > 0) {

            %>
  
 
                  </td>
              </tr>
              <%}%>
              <%}%>
          </table>
</div>
</body>
</html>
