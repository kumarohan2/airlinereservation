<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/AirlineReservation/">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Details</title>
</head>
<style>
div {
  background-color: lightgrey;
  width: 150px;
  border: 15px Black;
  padding: 25px;
  margin: 10px;
}
th {
  padding-top: 25px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
  position:relative;
}
/* table {
padding-top: 5px;
  border-collapse: collapse;
  width: 65%;
} */
table {
    vertical-align: top;
}

</style>

<body>
<form action="controller/initiateBooking">
<div>
<input type="radio" name="time" value="before12" onclick="resetFilters()" >Reset All Filters<br><br>


<br><h3>Select by time</h3><br>
<input type="radio" name="time" value="before12" onclick="morningFlight()" >Morning<br><br>
<input type="radio" name="time" value="after5" onclick="eveningFlight()">Evening<br><br>
<!-- <input type="radio" name="time" value="after5" onclick="document.location.reload(true)" >Evening<br><br> -->

<h3>Select by Flight</h3><br>
<c:forEach items="${ sessionScope.carriers }" var="carrier">
	<input type="radio" name="carrier" value="${ carrier }"  onclick="loadFlights('${carrier}')"/>${ carrier } <br/>

</c:forEach>
</div>

<h1 align="center">Details of All the Flight</h1>
<table align="center" style="float: top;">

<tr>
<th >Source:</th>
<th>Destination</th>
<th>Departure Time</th>
<th>Arrival Time</th>
<th>Flight Name</th>
<th>Flight Price</th>
<th>No of seats</th></tr>

<c:forEach items="${ listOfFlight }" var = "flight">
    <tr>
	<td>${ flight.source}</td>
	<td>${ flight.destination }</td>
	
	<td>${ flight.arivalTime } </td>

<td>${ flight.departureTime }</td>

	<td>${ flight.flightName } </td>
	
	<td>${ flight.price }</td>
	
		<td>${ flight.noOfSeats } </td> 
<td>
     <a href="controller/initiateBooking?flightId=${flight.flightId}">BOOK</a></td>
		</tr>
	<tr>
</c:forEach>


<script>
function morningFlight(){
	document.location.href="controller/listMorningFlight";
}

function eveningFlight(){
	document.location.href="controller/listEveningFlight";
}

function resetFilters(){
	document.location.href="controller/reset";
}

function loadFlights(carrier) {
	document.location.href="controller/listFlightByCarrier?carrier="+carrier;
}
</script>

  </table>
</body>
</html>