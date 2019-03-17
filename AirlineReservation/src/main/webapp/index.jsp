<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<base href="/AirlineReservation/">
<title>Flight Search</title>

</head>
<script src="validate.js"></script>
<script type="text/javascript">
      
		function validate()	{
			  var src = document.forms["regForm"]["source"];
		        var dstn = document.forms["regForm"]["destination"];
                var date = document.forms["regForm"]["date"];
			if(src.selectedIndex == "")
			{
				window.alert("Please select your source");
				src.focus();
				return false;		
			}
			if(dstn.selectedIndex == "")
			{
				window.alert("Please select your destination");
				dstn.focus();
				return false;		
			}
			if(date)
			return true;
		}
</script>
<body>
<form action="controller/search" method="post" name="regForm" onsubmit="return validate()">

Source: <select name="source">
	 <option value="">Select Source</option>
  <option value="delhi">Delhi</option>
  <option value="mumbai">Mumbai</option>
  <option value="chennai">Chennai</option>
  <option value="banglore">Banglore</option>
  <option value="calcutta">Calcutta</option>
  <option value="kerela">Kerela</option>
  <option value="tamil nadu">Tamil Nadu</option>
  <option value="punjab">Punjab</option>
  <option value = "chandigarh">Chandigarh</option>
  <option value = "gujarat">Gujarat</option>
  <option value = "pune">Pune</option>
</select>

Destination: <select name="destination">
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
  <option value = "chandigarh">Chandigarh</option>
  <option value = "gujarat">Gujarat</option>
  <option value = "pune">Pune</option>
</select>


Date of Journey:  <input type="date" id="start" name="journeyDate"
       
       min="2019-03-12" max="2020-12-12">
       
       
       <input type="submit" value="Search Flight">
       </form>
       
       
</body>
</html>