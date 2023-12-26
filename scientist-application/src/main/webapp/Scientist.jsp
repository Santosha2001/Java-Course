<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scientist Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
<style type="text/css">
form {
	max-width: 800px;
	margin: 10px auto;
	padding: 20px;
	border: 1px solid #ccc;
	background-color: #f1c2c2;
	border-radius: 5px;
}

label {
	display: block;
	margin-bottom: 5px;
}

input[type="text"], select {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #161515;
	border-radius: 3px;
}

input[type="submit"] {
	background-color: black;
	color: #fff;
	padding: 10px 15px;
	border: none;
	border-radius: 3px;
	cursor: pointer;
}

select {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type="submit"]:hover {
	background-color: olive;
}

.radio-btn {
	display: flex;
	align-items: center;
}

.radio-btn div {
	margin: 10px;
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg text-bg-info p-3">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Home</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Scientist</a></li>
				</ul>
				<div class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</div>
			</div>
		</div>
	</nav>
	
	<span style="color:red">
		<c:forEach var="objectErrors" items="${error}">
			${objectErrors.defaultMessage}<br>
		</c:forEach>
	</span>
	
	<form action="science" method="post" onclick="return validate()">
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="scientistName" id="name"
					placeholder="Scientist name" value="${dto.getScientistName()}" onchange="handleName()"/>
					<span id="nameError" style="color: red"></span><br> 
			</div>
			<div class="col">
				<select name="field" class="form-control" id="field" onchange="handleField()">
					<option value="">Select field</option>
					<option value="Science" <c:if test="${dto.getField()=='Science'}"> selected="selected"</c:if>>Science</option>
					<option value="Biology" <c:if test="${dto.getField()=='Biology'}"> selected="selected"</c:if>>Biology</option>
					<option value="Space" <c:if test="${dto.getField()=='Space'}"> selected="selected"</c:if>>Space</option>
					<option value="Earth" <c:if test="${dto.getField()=='Earth'}"> selected="selected"</c:if>>Earth</option>
				</select>
				<span id="fieldError" style="color: red"></span><br>
			</div>
		</div>
		
		<div class="row">
			<div class="col">
				<input type="number" class="form-control" name="experience" id="experience"
					placeholder="Experience" value="${dto.getExperience()}" onchange="handleExperience()"/>
					<span id="expeError" style="color: red"></span><br>
			</div>
			<div class="col">
				<select name="country" class="form-control" id="country" onchange="handleCountry()">
					<option value="">Select country</option>
					<option value="India" <c:if test="${dto.getCountry()=='India'}"> selected="selected" </c:if>>India</option>
					<option value="America" <c:if test="${dto.getCountry()=='America'}"> selected="selected" </c:if>>America</option>
					<option value="China" <c:if test="${dto.getCountry()=='China'}"> selected="selected" </c:if>>China</option>
				</select>
				<span id="countryError" style="color: red"></span><br>
			</div>
		</div>
		
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="achivement" id="achivement"
					placeholder="Achivement" value="${dto.getAchivement()}" onchange="handleAchivment()"/>
					<span id="achiError" style="color: red"></span><br>
			</div>
		</div>

		<div class="row">
			<div class="col">
				<button type="reset" class="form-control text-bg-secondary p-3">Reset</button>
			</div>
			<div class="col">
				<button type="submit" class="form-control text-bg-secondary p-3" id="submit" >Submit</button>
			</div>
		</div>
	</form>
	
	<script>
		function validate() {
			let name = document.getElementById("name").value;
			let field = document.getElementById("field").value;
			let experience = document.getElementById("experience").value;
			let country = document.getElementById("country").value;
			let achivement = document.getElementById("achivement").value;
			
			let button=document.getElementById("submit").value;

			if (name!=null && name!="" && name.length < 3 || name.length > 20) {
				document.getElementById("nameError").innerHTML = "Please enter the name here..";
				return false;
			}
			else{
				document.getElementById("nameError").innerHTML ="";
			}
			
			if (field==="") {
				document.getElementById("fieldError").innerHTML = "Please select here..";
					return false;
			}
			else{
				document.getElementById("fieldError").innerHTML ="";
			}
			
			if (experience.length <= 0) {
				document.getElementById("expeError").innerHTML = "Please enter the valid experience here.."
				return false;
			}
			else{
				document.getElementById("expeError").innerHTML ="";
			}
			
			if (country==="") {
				document.getElementById("countryError").innerHTML = "Please select here..";
					return false;
			}
			else{
				document.getElementById("countryError").innerHTML ="";
			}
			
			if (achivement.length < 3 || achivement.length > 20) {
				document.getElementById("achiError").innerHTML = "Please enter the achivement here..";
				return false;
			}
			else{
				document.getElementById("achiError").innerHTML ="";
			}
			
			button.removeAttribute('submitButton');
			return true;

		}
		function handleName() {

			var name = document.getElementById("name");
			var btn= document.getElementById("submit");

			if (name.value.length > 3 && name.value.length < 20) {
				document.getElementById("nameError").innerHTML = "";
				btn.removeAttribute("disabled")
			} 
			else {
				document.getElementById("nameError").innerHTML = "Please enter the valid  name here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
		
		function handleExperience() {

			var experience = document.getElementById("experience");
			var btn= document.getElementById("submit");

			if (experience.value.length <= 2) {
				document.getElementById("expeError").innerHTML = ""
				btn.removeAttribute("disabled")
			} 
			
			else {
				document.getElementById("expeError").innerHTML = "Please enter the valid experience here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
		
		function handleAchivment() {

			var achivement = document.getElementById("achivement");
			var btn= document.getElementById("submit");

			if (achivement.value.length > 3 && achivement.value.length < 20) {
				document.getElementById("achiError").innerHTML = "";
				btn.removeAttribute("disabled")
			} 
			else {
				document.getElementById("achiError").innerHTML = "Please enter the valid  name here..";
				btn.setAttribute("disabled", "");
				return;
			}
		}
	</script>
</body>
</html>