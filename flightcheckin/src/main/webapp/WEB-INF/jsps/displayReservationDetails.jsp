<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
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
    background-image: -ms-linear-gradient( 136deg, rgb(0,158,253) 0%, rgb(42,245,152) 100%);">
<h2>Flight Details</h2>

Airlines: ${reservation.flight.operatingAirLines}<br/>
Flight No:${reservation.flight.flightNumber}<br/>
Departure City:${reservation.flight.departureCity}<br/>
Arrival City:${reservation.flight.arrivalCity}<br/>
Date Of Departure:${reservation.flight.dateOfDeparture}<br/>
Estimate Departure Time:${reservation.flight.estimatedDepartureTime}<br/>

<h2>Passenger Details</h2>

First Name: ${reservation.passenger.firstName}<br/>
Last Name: ${reservation.passenger.lastName}<br/>
Email Name: ${reservation.passenger.email}<br/>
Phone Name: ${reservation.passenger.phone}<br/>

<form action="completeCheckIn" method="post">
Enter the Number Of Bags You Want To Check in:<input type="text" name="numberOfBags">
<input type="hidden" value="${reservation.id}" name="reservationId">
<input type="submit" value="checke In">
</form>
</body>
</html>