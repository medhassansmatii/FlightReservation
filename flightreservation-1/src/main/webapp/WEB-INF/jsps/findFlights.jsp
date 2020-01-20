<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Find Flights</title>


<style type="text/css">
/* @extend display-flex; */
display-flex, .header, .form-group {
	display: flex;
	display: -webkit-flex;
}

list-type-ulli {
	list-style-type: none;
	margin: 0;
	padding: 0;
}


a:focus, a:active {
	text-decoration: none;
	outline: none;
	transition: all 300ms ease 0s;
	-moz-transition: all 300ms ease 0s;
	-webkit-transition: all 300ms ease 0s;
	-o-transition: all 300ms ease 0s;
	-ms-transition: all 300ms ease 0s;
}

input, select, textarea {
	outline: none;
	appearance: unset !important;
	-moz-appearance: unset !important;
	-webkit-appearance: unset !important;
	-o-appearance: unset !important;
	-ms-appearance: unset !important;
}

input::-webkit-outer-spin-button, input::-webkit-inner-spin-button {
	appearance: none !important;
	-moz-appearance: none !important;
	-webkit-appearance: none !important;
	-o-appearance: none !important;
	-ms-appearance: none !important;
	margin: 0;
}

input:focus, select:focus, textarea:focus {
	outline: none;
	box-shadow: none !important;
	-moz-box-shadow: none !important;
	-webkit-box-shadow: none !important;
	-o-box-shadow: none !important;
	-ms-box-shadow: none !important;
}

input[type=checkbox] {
	appearance: checkbox !important;
	-moz-appearance: checkbox !important;
	-webkit-appearance: checkbox !important;
	-o-appearance: checkbox !important;
	-ms-appearance: checkbox !important;
}

input[type=radio] {
	appearance: radio !important;
	-moz-appearance: radio !important;
	-webkit-appearance: radio !important;
	-o-appearance: radio !important;
	-ms-appearance: radio !important;
}

img {
	max-width: 100%;
	height: auto;
}

figure {
	margin: 0;
}

p {
	margin-bottom: 0px;
}

h1 {
	line-height: 1.8;
	margin: 0;
	padding: 0;
	font-weight: bold;
	color: #fff;
	font-family: Poppins;
	font-size: 21px;
	text-align: center;
	margin-bottom: 28px;
}

.clear {
	clear: both;
}

body {width: 100%;
	margin:  0 auto;
	background-image: -moz-linear-gradient( 136deg, rgb(0,158,253) 0%, rgb(42,245,152) 100%);
    background-image: -webkit-linear-gradient( 136deg, rgb(0,158,253) 0%, rgb(42,245,152) 100%);
    background-image: -ms-linear-gradient( 136deg, rgb(0,158,253) 0%, rgb(42,245,152) 100%);
	display: flex;
	display: -webkit-flex;
	justify-content: center;
	-o-justify-content: center;
	-ms-justify-content: center;
	-moz-justify-content: center;
	-webkit-justify-content: center;
	align-items: center;
	-o-align-items: center;
	-ms-align-items: center;
	-moz-align-items: center;
	-webkit-align-items: center;
}

.main {
	position: relative;
}

.container {
	width: 970px;
	background: rgba(11, 13, 24, 0.6);
	margin: 100px auto;
	border-radius: 10px;
	-moz-border-radius: 10px;
	-webkit-border-radius: 10px;
	-o-border-radius: 10px;
	-ms-border-radius: 10px;
}

.booking-form {
	padding: 35px 70px 51px 70px;
}

.header {
	align-items: center;
	-moz-align-items: center;
	-webkit-align-items: center;
	-o-align-items: center;
	-ms-align-items: center;
	justify-content: space-between;
	-moz-justify-content: space-between;
	-webkit-justify-content: space-between;
	-o-justify-content: space-between;
	-ms-justify-content: space-between;
	padding: 50px 57px;
}

input {
	border: none;
	background: #fff;
	border-radius: 5px;
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	-o-border-radius: 5px;
	-ms-border-radius: 5px;
	box-sizing: border-box;
	width: 100%;
	padding: 13px 20px;
	font-size: 16px;
	font-weight: 600;
	color: #222;
	display: block;
	font-family: Poppins;
	position: relative;
	z-index: 9;
}

input::-webkit-input-placeholder {
	color: #999;
}

input::-moz-placeholder {
	color: #999;
}

input:-ms-input-placeholder {
	color: #999;
}

input:-moz-placeholder {
	color: #999;
}

.submit {
	background: #f8ba0f;
	color: #fff;
	font-size: 14px;
	margin-top: 23px;
	padding: 15px 20px;
	cursor: pointer;
}

.submit:hover {
	background-color: #ce9906;
}

label {
	font-size: 12px;
	font-weight: 500;
	margin-bottom: 2px;
	display: block;
}

#quantity {
	color: #999;
}

.form-group {
	align-items: center;
	-moz-align-items: center;
	-webkit-align-items: center;
	-o-align-items: center;
	-ms-align-items: center;
	justify-content: space-between;
	-moz-justify-content: space-between;
	-webkit-justify-content: space-between;
	-o-justify-content: space-between;
	-ms-justify-content: space-between;
}

.form-destination {
	width: 230px;
}

.form-date-from, .form-date-to {
	width: 155px;
}

.form-quantity {
	width: 80px;
	position: relative;
}

.form-submit {
	width: 140px;
}

.modify-qty {
	position: absolute;
	right: 12px;
	font-size: 18px;
	color: #999;
	z-index: 99;
	cursor: pointer;
}

.plus {
	top: 23px;
}

.minus {
	bottom: 0px;
}

.form-icon {
	position: relative;
}

.ui-datepicker-trigger {
	position: absolute;
	right: 16px;
	top: 40px;
	color: #999;
	font-size: 16px;
	z-index: 99;
	background: transparent;
	border: none;
	outline: none;
	cursor: pointer;
}

@media screen and (max-width: 1000px) {
	.container {
		width: calc(100% - 30px);
		max-width: 100%;
	}
	.form-group {
		flex-direction: column;
		-moz-flex-direction: column;
		-webkit-flex-direction: column;
		-o-flex-direction: column;
		-ms-flex-direction: column;
	}
	.form-destination, .form-date-from, .form-date-to, .form-quantity {
		width: 100%;
		margin-bottom: 20px;
	}
}

@media screen and (max-width: 480px) {
	.booking-form {
		padding: 35px 30px 51px 30px;
	}
}
</style>
</head>
<body>

	<div class="main">


		<div class="container">
			<form id="booking-form" class="booking-form" action="findFlights"
				method="post">
				<div class="form-group">
					<div class="form-destination">
						<label for="destination"><h3>From</h3></label> <input type="text"
							id="destination" name="from" placeholder="EG. HAWAII" />
					</div>
					<div class="form-date-from form-icon">
						<label for="date_from"><h3>To</h3></label> <input type="text"
							id="date_from" name="to" class="date_from"
							 />
					</div>

					<div class="form-date-from form-icon">
						<label for="date_from"><h3>Departure Date</h3></label> <input type="text"
							id="date_from" name="departureDate" class="date_from"
							 />
					</div>

					<div class="form-submit">
						<input type="submit" id="submit" class="submit" value="search" />
					</div>
				</div>
			</form>
		</div>

	</div>



</body>

</html>