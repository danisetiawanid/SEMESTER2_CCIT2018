$.backstretch(
	[
	"img1.jpg",
	"img2.jpg",
	"img3.jpg"
	], 
	{
		duration: 1200, 
			fade: 600
		});

function validate(){
	if (document.f1.check1.checked==false) {
		alert("Please select the checkbox");
		return false
	}
	else
		return true