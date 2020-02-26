<%-- 
    Document   : donate1
    Created on : Jul 4, 2019, 11:08:01 AM
    Author     : Martin Noverardi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>
function validateForm(){
      
    var x = document.forms["donate"]["donate1"].value;
    if (x == ""){
      alert ("Amount must be filled out");
      return false;

    }
    alert ("Thank You For Donation")
    }

  </script>
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


.linetop {
  position: absolute;
  top: 15px;
  right: 140px;
  width: 2.7%;
  opacity: 0.6;
}
.donasi{
  position: absolute;
top: 25px;
right: 270px;
font-size: 20px;
color: white;
line-height: 1.1;
}

.donate {
  margin: 50px auto;
  width: 400px;
  padding: 10px;
  border: 1px solid #ccc;
  background: lightblue;
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
input[type=text], input[type=number], textarea{
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  resize: vertical;
}
label {
  padding: 12px 12px 12px 0;
  display: inline;
}
input[type=submit]{
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: center;
}
.container{
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
.col-25{
  float: left;
  width: 25%;
  margin-top: 6px;
}
.col-75{
  float: left;
  width: 75%;
  margin-top: 6px;
}
.row:after{
  content: "";
  display: table;
  clear: both;
}
  </style>
    </head>
    <body>
          <div class="container1">

<hr>
  <div class="logo1"> <a href="wecare.jsp"> <img src="images/care-logo-b.png" alt="logo" width="55%"> </a> </div>
    <div class="linetop"> <img src="images/small-line-b.png" alt="line" width="100%"> </div> <!-- HOME -->
      <div class="aboutus"> <a href="aboutus.jsp">about us</a></div> <!-- ABOUT US -->
<div class="donasi"><a href="donate.jsp">Donation</a></div>
  </div>

  <br><br><br><br><br>

<br>
        <form action="DonationController?data=donation&proses=input-donation" method="post">
           
		<div class="container">
                <div class="row">
                <div class="col-25">
                <label for="donasi">Title</label>
                </div>
                <div class="col-75">
                <input type="text" id="donasi" name="judul" readonly="disabled" ></td>
                </div>
                </div>
                <br>
                
                 <div class="row">
                 <div class="col-25">
                 <label>Name</label>
                 </div>
                 <div class="col-75">
                     <form name="donate" onsubmit="return validateForm()">
                 <input type="text" name="nama_donatur" placeholder="Enter Your Name">
		 </div>
                 </div>
                
                 <div class="row">
                 <div class="col-25">
                 <label>Phone</label>
                 </div>
                 <div class="col-75">
                 <input type="number" name="phone" placeholder="Enter Your Phone Number">
		 </div>
                 </div>
                
                  <div class="row">
                 <div class="col-25">
                 <label for="donate1">Amount</label>
                 </div>
                 <div class="col-75">
                 <input type="number" name="jumlah" placeholder="Enter Your Phone Amount (Rp)" required>
		 </div>
                 </div>
                 
  
            
                     <div class="row">
                    <div class="col-25">
                    <label>Payment</label>
                    </div>
                         
                    <div class="col-75">
                    <select name="metode">
                    <option>Bank mega</option>  
                    <option>Bank Muamalat</option>
                    <option>Gopay</option>
                    </select>
                     </div>
                     </div>
            
                     <div class="row">
                    <div class="col-25">
                    <label for="pesan">Message</label>
                    </div>
                     <div class="col-75">
                    <textarea name="pesan" placeholder="Enter Your Message"></textarea>
		    </div>
                    </div>
            
		
                    <center><input type="submit" value="Donate"></center>
</form>
		</div>
                </div>
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
  var title = sessionStorage.getItem('title');
  document.getElementById("donasi").value=title;
</script>
</body>


</html>
