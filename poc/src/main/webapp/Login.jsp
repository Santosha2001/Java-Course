<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Page</title>
<link rel="stylesheet" href="style.css">
</head>

<body>
	<header>
		<nav id="navbar">
			<div class="left">Santosh</div>
			<div class="right">
				<ul>
					<li><a href="index.jsp">Home</a></li>
					<li><a href="#">Log In</a></li>
				</ul>
			</div>
		</nav>
	</header>

	<main>
		<div id="container">
			<h1>User login</h1>
			<form class="form" action="jsps" method="post">
				<div class="input-box">
					<label for="userId">User Id</label> <input type="text"
						name="userId" placeholder="enter user id" required>
				</div>

				<div class="input-box">
					<label for="password">Password</label> <input type="password"
						name="password" placeholder="enter password" required>
				</div>

				<button type="submit">Submit</button>
			</form>
		</div>
	</main>
</body>
</html>