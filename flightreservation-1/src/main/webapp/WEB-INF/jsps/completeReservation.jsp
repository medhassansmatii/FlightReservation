<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
</head>
<body style=" 
margin:0 auto;
padding: 0 20px 20px 20px;
width:600px;
border:2px solid black; 
background-image: -moz-linear-gradient( 136deg, rgb(0,158,253) 0%, rgb(42,245,152) 100%);
    background-image: -webkit-linear-gradient( 136deg, rgb(0,158,253) 0%, rgb(42,245,152) 100%);
    background-image: -ms-linear-gradient( 136deg, rgb(0,158,253) 0%, rgb(42,245,152) 100%);" >



<h1>Complete Reservation</h1>
Airline:  ${flight.operatingAirlines} <br/>
departure Country: ${flight.departureCity} <br/>
Arrival Country: ${flight.arrivalCity} <br/>



<form action="completeReservation" method="post">
<pre>
<h2>Passeger Detaits</h2>
First Name: <input type="text" name="passengerFirstName">
Last Name:  <input type="text" name="passengerLastName">
Email:      <input type="text" name="passengerEmail">
Phone:      <input type="text" name="passengerPhone">
<h2>Cart Details</h2>
Name on the card:<input type="text" name="nameOnTheCard">
Card No:         <input type="text" name="CardNumber">
Expiry Date:     <input type="text" name="expirationDate">
Three Digit Code:<input type="password" name="SecurityCode">
<input type="hidden" name="flightid" value="${flight.id}">
<input type="submit" class="btn btn-success" value="Confirm">
</pre>
</form>


</body>
</html>