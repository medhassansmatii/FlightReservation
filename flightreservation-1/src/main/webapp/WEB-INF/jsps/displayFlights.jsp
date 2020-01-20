<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight-display</title>
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
	<h2>Flights:</h2>
	
	
	<table class="table">
  <caption>List of users</caption>
    
  <thead>
  
    <tr>
      <th scope="col">#</th>
      <th scope="col">Airlines</th>
      <th scope="col">Departure City</th>
      <th scope="col">Departure Time</th>
       <th scope="col"></th>
    </tr>
  </thead>
  
  <tbody>
  <c:forEach items="${flights}" var="flight">
    <tr>
      <th scope="row">1</th>
      <td>${flight.operatingAirlines}</td>
      <td>${flight.departureCity}</td>
      <td>${flight.estimatedDepartureTime}</td>
      <td><a href="showCompleteReservation?flightId=${flight.id}" class="btn btn-success">Select</a></td>
    </tr>
  </c:forEach>
  </tbody>
  
  	
</table>


</body>
</html>