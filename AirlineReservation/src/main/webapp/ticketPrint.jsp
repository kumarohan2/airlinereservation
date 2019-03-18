<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/AirlineReservation/">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>



.button
{
background-color: #333;
font-size: 10px;
padding: 8px 12px;
border-radius: 8px;

cursor: pointer;
}

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a, .dropbtn {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 46px;
    text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color:#c22700;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #E0E0E0 ;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align:left;
}

.dropdown-content a:hover {background-color: #F0F0F0 }

.dropdown:hover .dropdown-content {
    display: block;
}
article {
    margin-left: 170px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}
header, footer {
  
    color: white;
    background-color:#c22700;
    clear: left;
    text-align:left ;
}
textarea {
   
    height: 150px;
    padding: 12px 20px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
   
}


#invoice-POS{
  box-shadow: 0 0 1in -0.25in rgba(0, 0, 0, 0.5);
  padding:2mm;
  margin: 0 auto;
  width: 100mm;
  background: #FFF;
  
  
::selection {background: #f31544; color: #FFF;}
::moz-selection {background: #f31544; color: #FFF;}
h1{
  font-size: 1.5em;
  color: #222;
}
h2{font-size: .9em;}
h3{
  font-size: 1.2em;
  font-weight: 300;
  line-height: 2em;
}
p{
  font-size: .7em;
  color: #666;
  line-height: 1.2em;
}
 
#top, #mid,#bot{ /* Targets all id with 'col-' */
  border-bottom: 1px solid #EEE;
}

#top{min-height: 100px;}
#mid{min-height: 80px;} 
#bot{ min-height: 50px;}

#top .logo{
  //float: left;
	height: 60px;
	width: 60px;
	background: url(images/logo1.png) no-repeat;
	background-size: 60px 60px;
}
.clientlogo{
  float: left;
	height: 100px;
	width: 100px;
	background: url(http://michaeltruong.ca/images/client.jpg) no-repeat;
	background-size: 60px 60px;
  border-radius: 50px;
}
.info{
  display: block;
  //float:left;
  margin-left: 0;
}
.title{
  float: right;
}
.title p{text-align: right;} 
table{
  width: 100%;
  border-collapse: collapse;
}
td{
  //padding: 5px 0 5px 15px;
  //border: 1px solid #EEE
}
.tabletitle{
  //padding: 5px;
  font-size: .5em;
  background: #EEE;
}

#legalcopy{
  margin-top: 5mm;
} 

}
</style>
</head>
<title>Booking Details</title>

<body style=" background-color: #E8E8E8;">
<br>

<br>
<ul>
  <li><a href=" index.jsp">HOME</a></li>

</div></li>


<article></form>
  <div id="invoice-POS">
    
    <center id="top">
      <div class="logo"></div>
      <div class="info"> 
        <h2>Airline Services</h2>
      </div><!--End Info-->
    </center><!--End InvoiceTop-->
    
    <div id="mid">
      <div class="info">
        <h2>Flight Details:</h2>
        <table>
          <tr>
            </tr>
            <tr>
            <th>Flight Id:</th>  <td>${ flightDetails.flightId }</td> 
            </tr>
            <tr>
            <th>Flight Name:</th>  <td> ${ flightDetails.flightName }  </td> 
            </tr>
			<tr>
            <th>Arrival Time:</th>  <td> ${ flightDetails.arivalTime } </td> 
            </tr>
		 	<tr>
            <th>Departure Time:</th>  <td> ${ flightDetails.departureTime }</td> 
            </tr>
			<tr>
            <th>Total Price:</th>  <td> ${ flightDetails.price } </td> 
            </tr>
            
            
		
       </table> 
      </div>
    </div><!--End Invoice Mid-->
    
  

					<div id="legalcopy">
						<p class="legal"><strong>Thank you for booking with us!!</strong>  
						</p>
					</div>

				</div><!--End InvoiceBot-->
  </div><!--End Invoice-->
  <button type="submit" onclick="window.location = 'index.jsp';">HomePage</button>


</body>
</html>