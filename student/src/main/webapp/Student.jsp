<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
<h1>Student Details.</h1>
<h4>${errormsg}</h4>
<span style="color:red">
	<c:forEach var="objectErrors" items="${error}">
	${objectErrors.defaultMessage}<br></c:forEach>
</span>
<form action="learner" method="post">
Name: <input type="text" name="name" value="${dto.getName()}" /><br><br>
College: <input type="text" name="college" value="${dto.getCollege()}" /><br><br>
Student Id:<input type="text" name="studentId" value="${dto.getStudentId()}" /><br><br>
Semester: <select name="semester">
<option value="">Select option</option>
<option value="4" <c:if test="${dto.getSemester()==4}"> selected="selected"</c:if>>4</option>
<option value="5" <c:if test="${dto.getSemester()==5}"> selected="selected"</c:if>>5</option>
<option value="6" <c:if test="${dto.getSemester()==6}"> selected="selected"</c:if>>6</option>
<option value="7" <c:if test="${dto.getSemester()==7}"> selected="selected"</c:if>>7</option>
<option value="8" <c:if test="${dto.getSemester()==8}"> selected="selected"</c:if>>8</option>
</select><br><br>
Year: <input type="number" name="year" value="${dto.getYear()}" /><br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>