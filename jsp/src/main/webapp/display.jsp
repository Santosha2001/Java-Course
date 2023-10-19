<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home Page</title>
<link rel="stylesheet" href="style.css">
</head>

<body>
	<header>
		<nav id="navbar">
			<div class="left">Santosh</div>
			<div class="right">
				<ul>
					<li><a href="#">Home</a></li>
					<li><a href="day.jsp">Days</a></li>
				</ul>
			</div>
		</nav>
	</header>
	<div style="text-align: center">
		<h2 style="color: blue">Days stored Succesfully..</h2>
		<h3>Day: ${day}</h3><br>
		<h3>Date: ${date}</h3><br>
		<h3>Month: ${month}</h3><br>
		<h3>year: ${year}</h3><br>
	</div>
</body>
</html>