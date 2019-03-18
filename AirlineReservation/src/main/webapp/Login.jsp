<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

form {
	border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: auto;
}

button:hover {
	opacity: 0.8;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: teal;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

.cancelbtn {
	width: 100px, padding: 90px90px,
}
</style>
<title>Login Page</title>
<base href="/AirlineReservation/">
</head>
<body>

	<form action="controller/login" method="post">
		<div class="container">
			<label for="uname"><b>Email</b></label> <input type="text"	placeholder="Enter Email" name="emailId" required
				onChange="ValidateEmail(this)"> <span
				style="color: red; display: none" id="errorEmail">Email is not valid</span> <label for="psw"><b>Password</b></label> <input
				type="password" placeholder="Enter Password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required>

			<button type="submit">Login</button>
			<label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label>
		</div>
		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn"
				onclick="window.location='index.jsp';">Cancel</button>
			<button type="btn" class="cancelbtn" type="submit"
				onclick="window.location = 'register.jsp';">Register</button>
			<span class="psw">Forgot <a href="getEmail.jsp"
				style="text-decoration: none">password?</a></span>
		</div>
	</form>

</body>
<script type="text/javascript">


			var reg = /^([A-Za-z0-9_\-\.])+\@([a-z]{3,10})+\.([a-z]{2,4})$/;

			if (reg.test(email.value) == false){
  			window.alert("Please enter a valid E-mail Address.");
 		    email.focus();
  			return false;
			}
	function ValidateEmail(inputText) {
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if (inputText.value.match(mailformat)) {
			document.getElementById('errorEmail').style.display = 'none';
			return true;
		} else {
			document.getElementById('errorEmail').style.display = 'block';
			return false;
		}
	}
</script>
</html>