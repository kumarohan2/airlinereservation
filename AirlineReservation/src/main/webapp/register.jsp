<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<script>
	function register() {
		var title = document.forms["RegForm"]["title"];
		var fname = document.forms["RegForm"]["firstName"];
		var lname = document.forms["RegForm"]["lastName"];
		var email = document.forms["RegForm"]["emailId"];
		var password = document.forms["RegForm"]["password"];
		var mobile = document.forms["RegForm"]["mobileNo"];
		var dob = document.forms["RegForm"]["dob"];
		var submit = document.forms["RegForm"]["Submit"];
		var passwordFormat = "(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";
		var phoneno = /^\d{10}$/;
		var reg = /^([A-Za-z0-9_\-\.])+\@([a-z]{3,10})+\.([a-z]{2,4})$/;

		if (title.value == "") {
			window.alert("Please enter your Title");
			title.focus();
			return false;
		}

		if (fname.value == "") {
			window.alert("Please enter your first name");
			fname.focus();
			return false;
		}

		if (lname.value == "") {
			window.alert("Please enter your last name");
			lname.focus();
			return false;
		}

		if (email.value == "") {
			window.alert("Please enter a valid e-mail address.");
			email.focus();
			return false;
		}

		if (reg.test(email.value) == false) {
			window.alert("Please enter a valid E-mail Address.");
			email.focus();
			return false;
		}

		if (password.value == "") {
			window.alert("Please enter your Password");
			password.focus();
			return false;
		}

		if (!password.value.match(passwordFormat)) {
			window.alert("Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters");
			password.focus();
			return false;
		}
		
		if (mobile.value == "") {
			window.alert("Please enter your mobile number.");
			mobile.focus();
			return false;
		}

		if (!mobile.value.match(phoneno)) {
			window.alert("Please enter Mobile number having 10 digits");
			mobile.focus();
			return false;
		}

		if (dob.value == "") {
			window.alert("Please enter your DOB");
			dob.focus();
			return false;
		}
		return true;
	}
</script>
<script>
function alertfunction(){
	
}
</script>

<style>
 input[type=number], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid rgb(204, 204, 204);
	border-radius: 10px;
	box-sizing: border-box;
}
input[type=text], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid rgb(204, 204, 204);
	border-radius: 10px;
	box-sizing: border-box;
}
input[type=email], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid rgb(204, 204, 204);
	border-radius: 10px;
	box-sizing: border-box;
}
input[type=date], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid rgb(204, 204, 204);
	border-radius: 10px;
	box-sizing: border-box;
}
input[type=password], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid rgb(204, 204, 204);
	border-radius: 10px;
	box-sizing: border-box;
}
input[type=button] {
	width: 100%;
	background-color: #0c30f8;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: 1px solid rgb(243, 152, 152);
	border-radius: 10px;
	cursor: pointer;
}
input[type=submit] {
	width: 100%;
	background-color: 	#00BFFF;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: 1px solid rgb(243, 152, 152);
	border-radius: 10px;
	cursor: pointer;
}

input[type=button]:hover {
	background-color: #0daceb;
}

div {
	border-radius: 10px;
	background-color: #f2f2f2;
	padding: 20px;
}
 </style>
</head>

<body>
	<h1 align="center">REGISTRATION FORM</h1>
	<div class="form-wrapper">
	<form name="RegForm" action="controller/airline_register" method="post">
	<table align = "center">
		<tr>
			<td>
			Title: <select name="title" required>
							<option value="mr">Mr</option>
							<option value="mrs">Miss</option>
							<option value="mrs">Mrs</option>
			</td>
		</tr>
		<tr>
			<td>
			FirstName: <input type="text" size=65 name="firstName" required>
		</td>
		</tr>
		<tr>
			<td>
			LastName: <input type="text" size=65 name="lastName" required>
		</td>
		</tr>
		<tr>
			<td>
			Email: <input type="email" size=65 name="emailId" required>
		</td>
		</tr>
		<tr>
			<td>
			
			<label for="psw">Password</label>
	 <input type="password" id="psw" name="password" required>
		</td>
		</tr>
		<tr>
			<td>
			DateOfBirth: <input type="date" name="dob" required>
		</td>
		</tr>
		<tr>
		<td>
			MobileNumber: <input type="text" name="mobileNo" required>
		</td>
		</tr>
		<tr>
			<td>
			Security Question: <input type="text" name="securityquestion" required>
		</td>
		</tr>
		
		<tr>
			<td>
			Security Answer: <input type="text" name="securityanswer" required>
		</td>
		</tr>
		<tr>
			<td>
			<div><input type="submit" value="register"  name="Submit">
		</td>
		</tr>
		<tr>
		<td style="color:blue">Already a User? <a href="Login.jsp">Sign In </a></td>
		</tr>
		</table>
	</form>
	</div>
</body>
</html>