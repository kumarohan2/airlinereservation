<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Flight</title>
<base href="/AirlineReservation/">
<style type="text/css">
html{
            background: url('images/book.jpg') no-repeat center center fixed;
            webkit-background-size:cover;
            moz-background-size:cover;
            background-size:cover;
            background-size:cover;
            background-position: 0 0;
            color:white;

        }
</style>

</head>
<body>
<form method="post" action="controller/passenger">
<h1 align="center">Flight Details</h1>
<br/>
<table align = "center">
<tr>
	<td><c:forEach var = "i" begin = "1" end = "${ noOfPassengers }"> Enter details for Passenger ${ i } <br/>
         
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
       <tr><td>Flight Id: </td>
       <td>Flight Name :</td>
       <td>Arrival Time :</td>
       <td>Arrival Time :</td>
       <td>Price :</td>
       </tr>
       <tr>
<td> ${ flightDetails.flightId }</td>&nbsp; &nbsp;
<td> ${ flightDetails.flightName } </td>&nbsp; &nbsp;
<td> ${ flightDetails.arivalTime } </td> &nbsp; &nbsp;
<td>${ flightDetails.departureTime }</td>  &nbsp; &nbsp;
<td> ${ flightDetails.price }</td> &nbsp; &nbsp;</tr></div>
   <%--    <tr><td>Flight Id: </td>
<tr>
<td> ${ flightDetails.flightId }</td></tr>&nbsp; &nbsp;
<tr><td>Flight Name: ${ flightDetails.flightName } </td></tr>&nbsp; &nbsp;
<td>Arrival Time: ${ flightDetails.arivalTime } </td> &nbsp; &nbsp;
<td>Departure Time: ${ flightDetails.departureTime }</td>  &nbsp; &nbsp;
<td> Price: ${ flightDetails.price }</td> &nbsp; &nbsp;</tr></div>
<br/><br/> --%>
</table>
     

	<input type="submit" value="Continue" />

</form>
</body>
</html>