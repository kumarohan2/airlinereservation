<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/AirlineReservation/">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Booking</title>
</head>
<body>
<h1 align="center">Click proceed to pay!!</h1>

<c:forEach items="${ passengerDetailsDTO.passengerDetails }" var = "passengerDetails">
	${ passengerDetails.name } <br/>
	${ passengerDetails.gender } <br/>
	=======================<br/>
</c:forEach> 
	${ passengerDetailsDTO.mobileNo}<br/>
<a href="controller/confirmBooking">Proceed to pay!!</button></a>

</body>
</html>