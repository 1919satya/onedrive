function displayData() {
	var displayArea = document.getElementById("displayArea");
	
	var username = document.getElementById("username").value;
	var email = document.getElementById("email").value;
	var password = document.getElementById("password").value;
	var firstName = document.getElementById("firstName").value;
	var lastName = document.getElementById("lastName").value;
	
	displayArea.innerHTML = "Username : "+username +" <br>Pasword : "+password+" <br>Email"+email+" <br>First Name : "+firstName+" <br>Last name : "+lastName;
}