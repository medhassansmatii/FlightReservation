<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Start Check In</title>
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
<h2>Start Checkin</h2>
<form action="startCheckIn" method="post">
Enter the Reservation Id:<input type="text" name="reservationId">
<input type="submit" value="Start Checkin">
</form>
</body>
</html>