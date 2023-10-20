<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>LoginSuccess</title>
<link rel="stylesheet" href="style.css">
</head>

<body>
	<header>
		<nav id="navbar">
			<div class="left">Santosh</div>
			<div class="right">
				<ul>
					<li><a href="Login.jsp">Home</a></li>
					<li><a href="Address.jsp">Address</a></li>
				</ul>
			</div>
		</nav>
	</header>
	<div style="text-align: center">
		<h2 style="color: blue">Log In Succesfull..</h2>
		<h3>Welcome, ${userId}</h3>
		<br>
	</div>
</body>
</html>