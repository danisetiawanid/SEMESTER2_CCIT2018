function login() {
	var email = document.getElementById("email").value;
	var password = document.getElementById("password").value;

	if (email!="" && password!="") {
			alert("Login Successfully");
			window.location = "index.html";
			return true;
	}else{
		alert('You Should Insert the Data!');
	}
}

function register(){
var name = document.getElementById("name").value; 
var email = document.getElementById("email").value;
var password = document.getElementById("password").value;

confirm("You have entered:" + "\n \n Name : " + name + "\n Email : " + email + "\n Password : " + password + "\n\n Do you want to confirm these details ?");
if (window.confirm('If you click "ok" you would finished registration form  . click Cancel to change your data for registration ')) 
{
window.location.href="index.html";
}
} 