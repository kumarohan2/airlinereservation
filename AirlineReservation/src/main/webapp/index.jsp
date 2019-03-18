<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<base href="/AirlineReservation/">
<title>Flight Search</title>
<style>
* {
	padding: 0px;
	margin: 0px;
	box-sizing: border-box;
}

html {
	height: 100%;
}

body {
	background: url("images/img.jpg") no-repeat;
	height: 100%;
	background-size: 100% 100%;
}

.wrapper {
	display: flex;
	align-items: center;
	height: 100%;
}

.text-center {
	text-align: center;
}

.menubar {
	display: flex;
	justify-content: space-between;
	box-shadow: 1px 8px 20px 0 rgba(0, 0, 0, 0.07);
	padding: 5px 45px;
	background: #fff;
	align-items: center;
	position: fixed;
	top: 0;
	width: 100%;
	color: blue;
}

.logo {
	width: 100px;
	background: #e3f4ff;
	color: #fff;
	text-align: center;
	padding: 4px 10px;
}

.logo img {
	width: 55px;
}

.login-btn button {
	border: 1px solid white;
	padding: 9px;
	font-size: 15px;
	font-weight: bold;
	background: linear-gradient(60deg, #2358b7, #689eff);
	color: #fff;
	border-radius: 25px;
	width: 100px;
}

.logo p {
	margin-top: 10px;
	font-weight: bold;
	text-align: center;
	color: #2537a5;
}

.content-sec {
	background: rgba(255, 255, 255, 0.82);
	width: 80%;
	margin: auto;
	border-top: 4px solid #ff1100;
	padding: 25px;
	box- shadow: 1px 8px 20px 0 rgba(0, 0, 0, 0.7);
}

.inner-sec {
	display: flex;
	background: #fff;
	padding: 20px;
	justify-content: center;
}

.inner-sec div {
	border: 1px solid #d4d4d4;
	padding: 10px 24px;
	font-size: 28px;
	text-align: center;
	font-weight: bold;
}

.inner-sec input, .inner-sec select {
	margin-top: 10px;
	height: 30px;
}

.search-btn {
	background: linear-gradient(60deg, #2358b7, #689eff);
	border: none;
	color: #fff;
	padding: 10px;
	margin-top: 23px;
	border-radius: 25px;
	font-weight: bold;
	width: 200px;
	font-size: 22px;
	cursor: pointer;
}

ul {
	margin-bottom: 20px;
	text-align: center;
}

ul li {
	display: inline-block;
	list-style: none;
	font-weight: bold;
}

ul li input {
	margin-right: 4px;
}

html {
	background: url('images/slider.jpg') no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
	background-position: 0 0;
}
</style>

</head>
<script src="validate.js"></script>
<script type="text/javascript">
	function validate() {
		var src = document.forms["regForm"]["source"];
		var dstn = document.forms["regForm"]["destination"];
		var date = document.forms["regForm"]["journeyDate"];
		var seats = document.forms["regForm"]["noOfSeats"]
		if (src.selectedIndex == "") {
			window.alert("Please select your source");
			src.focus();
			return false;
		}
		if (dstn.selectedIndex == "") {
			window.alert("Please select your destination");
			dstn.focus();
			return false;
		}
		/* 	if(date.selectedIndex=="")
				{
				window.alert("Please select the date");
				date.focus();
				
			return false;
		} */
		if (seats.selectedIndex == "") {
			window.alert("Please select the seat");
			seats.focus();
			return false;
		}
		if (src.selectedIndex == dstn.selectedIndex) {
			window.alert("source and destination cannot be same");
			return false;

		}
	}
</script>
<body>
	<div class="menubar">
		<div class="logo">
			<img src="images/air-flight.jpg">
			<p>Flight</p>
		</div>
						<h1>Welcome to Airline!   ${ sessionScope.user.firstName}</h1>
		
		<div class="login-btn">
			<button type="submit" onclick="window.location = 'Login.jsp';">Login</button>
		</div>
	</div>
	<div class="wrapper">
		<div class="content-sec text-cenrter">

			<form action="controller/search" method="post" name="regForm"
				onsubmit="return validate()">

				<div class="inner-sec">
					<div>
						Source: <br><select name="source">
							<option value="">Select Source</option>
							<option value="delhi">Delhi</option>
							<option value="mumbai">Mumbai</option>
							<option value="chennai">Chennai</option>
							<option value="banglore">Banglore</option>
							<option value="calcutta">Calcutta</option>
							<option value="kerela">Kerela</option>
							<option value="tamil nadu">Tamil Nadu</option>
							<option value="punjab">Punjab</option>
							<option value="chandigarh">Chandigarh</option>
							<option value="gujarat">Gujarat</option>
							<option value="pune">Pune</option>
						</select> 
						</div>
						<div>
						Destination:<br> <select name="destination">
							<option value="">Select Destination</option>
							<option value="delhi">Delhi</option>
							<option value="pune">Pune</option>
							<option value="mumbai">Mumbai</option>
							<option value="chennai">Chennai</option>
							<option value="banglore">Banglore</option>
							<option value="calcutta">Calcutta</option>
							<option value="kerela">Kerela</option>
							<option value="tamil nadu">Tamil Nadu</option>
							<option value="punjab">Punjab</option>
							<option value="chandigarh">Chandigarh</option>
							<option value="gujarat">Gujarat</option>
							<option value="pune">Pune</option>
						</select> 
						</div>
						<div>
						Date of Journey: <br><input type="date" id="start" name="journeyDate"
							min="2019-03-12" max="2020-12-12"> 
							</div>
							<div>
							No of seats : <br>
							<input type="number" name="noOfSeats" min="1"  max="5"/>
							</div>
						<div>
						<button class="search-btn" type="submit" >Search Flight</button>
					</div>
			</form>
</body>
</html>
					
	
