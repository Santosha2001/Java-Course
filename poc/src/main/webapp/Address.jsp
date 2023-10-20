<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Address Page</title>
<link rel="stylesheet" href="style.css">
</head>

<body>
	<header>
		<nav id="navbar">
			<div class="left">Santosh</div>
			<div class="right">
				<ul>
					<li><a href="LoginSuccess.jsp">Home</a></li>
					<li><a href="#">Address</a></li>
				</ul>
			</div>
		</nav>
	</header>

	<main>
		<div id="container">
			<h1>Address Details</h1>
			<form class="form" action="jsps" method="post">
				<div class="input-box">
					<label for="number">Number</label> <input type="number" name="number"
						placeholder="enter your number" required>
				</div>

				<div class="input-box">
					<label for="city">City</label> <input type="text"
						name="city" placeholder="enter your city" required>
				</div>
				
				<div class="input-box">
					<label for="street">Street</label> <input type="text"
						name="street" placeholder="enter street" required>
				</div>

				<div class="input-box">
					<label for="country">Country</label> <input type="text"
						name="country" placeholder="enter country" required>
				</div>

				<button type="submit">Submit</button>
			</form>
		</div>
	</main>
</body>
</html>