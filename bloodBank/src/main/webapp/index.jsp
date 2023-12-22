<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="blood" method="post">
		Name<input type="text" name="name" /><br> <br> Group<input
			type="text" name="group" /><br> <br> Alcohol<input
			type="text" name="alcohol" /><br> <br> Sickness<input
			type="text" name="sickness" /><br> <br> Age<input
			type="text" name="age" /><br> <br> <input type="submit"
			value="save" /><br> <br> <select name="gender">
			<option>Select option</option>
			<option value="Male">Male</option>
			<option value="Female">Female</option>

		</select>

	</form>
</body>
</html>