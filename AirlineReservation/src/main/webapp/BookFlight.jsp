<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Flight</title>
<base href="/AirlineReservation/">

</head>
<body>
<form method="post" action="controller/passenger">
<h1>Flight Details</h1>
<br/>

Flight Id: ${ flightDetails.flightId }  &nbsp; &nbsp;
Flight Name: ${ flightDetails.flightName }  &nbsp; &nbsp;
Arrival Time: ${ flightDetails.arivalTime }  &nbsp; &nbsp;
Departure Time: ${ flightDetails.departureTime }  &nbsp; &nbsp;
 Price: ${ flightDetails.price } &nbsp; &nbsp;
<br/><br/>
	<c:forEach var = "i" begin = "1" end = "${ noOfPassengers }"> Enter details for Passenger ${ i } <br/>
         
             <label for="fullName"><b>Full Name:</b></label>
   			 <input type="text" placeholder="Full Name" name="passengerDetails[${ i - 1 }].name">
		&nbsp; &nbsp;
   <label for="gender"><b>Gender:</b></label>
   <input type="radio" name="passengerDetails[${ i - 1 }].gender" value="male" checked> Male
  <input type="radio" name="passengerDetails[${ i - 1 }].gender" value="female"> Female
  <input type="radio" name="passengerDetails[${ i - 1 }].gender" value="other"> Other
  <br/>  <br/>
      </c:forEach>

      Mobile No:
      +91-<input type="number" name="mobileNo" />

	<input type="submit" value="Continue" />

</form>
</body>
</html>