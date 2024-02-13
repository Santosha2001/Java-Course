<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Amazon</title>
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
						aria-current="page" href="#">Amazon</a></li>
				</ul>
				<div class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</div>
			</div>
		</div>
	</nav>

	<form action="cart" method="post" onclick="return validate()">
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="productName"
					id="productName" placeholder="Product name" value=""
					onchange="productName()" /> <span id="productNameError"
					style="color: red"></span><br>
			</div>
			<div class="col">
				<input type="text" class="form-control"
					name="productManufactureCompany" id="productManuCom"
					placeholder="Manufacture Company" value=""
					onchange="productManuCom()" /> <span id="productManuComError"
					style="color: red"></span><br>
			</div>
		</div>

		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="companyLocation"
					id="companyLocation" placeholder="Seller Company Location" value=""
					onchange="companyLocation()" /> <span id="companyLocationError"
					style="color: red"></span><br>
			</div>
			<div class="col">
				<select name="productSellerCompany" class="form-control" id="seller"
					onchange="seller()">
					<option value="">Select Seller</option>
					<option value="Amazon">Amazon</option>
					<option value="Flipkart">Flipkart</option>
					<option value="AJio">AJio</option>
				</select> <span id="sellerError" style="color: red"></span><br>
			</div>
		</div>

		<div class="row">
			<div class="col">
				<input type=number class="form-control" name="quantity"
					id="quantity" placeholder="Quantity" value="" /> <span
					id="quantityError" style="color: red"></span><br>
			</div>
			<div class="col">
				<input type="number" class="form-control" name="cost" id="cost"
					placeholder="Producr Cost" value="" /> <span id="costError"
					style="color: red"></span><br>
			</div>
		</div>

		<div class="row">
			<div class="col">
				<input type=text class="form-control" name="orderDate"
					id="orderDate" placeholder="Order Date" value="" /> <span
					id="orderDateError" style="color: red"></span><br>
			</div>
			<div class="col">
				<input type="text" class="form-control" name="deliveryDate"
					id="deliveryDate" placeholder="Delivery Date" value="" /> <span
					id="deliveryDateError" style="color: red"></span><br>
			</div>
		</div>

		<div class="row">
			<div class="col">
				<button type="reset" class="form-control text-bg-secondary p-3">Reset</button>
			</div>
			<div class="col">
				<button type="submit" class="form-control text-bg-secondary p-3"
					id="submit">Submit</button>
			</div>
		</div>
	</form>

	<script type="text/javascript">
	function validate() {
		let productName = document.getElementById("productName").value;
		let productManuCom = document.getElementById("productManuCom").value;
		let companyLocation = document.getElementById("companyLocation").value;
		let seller = document.getElementById("seller").value;
		let quantity = document.getElementById("quantity").value;
		let cost = document.getElementById("cost").value;
		let orderDate = document.getElementById("orderDate").value;
		let deliveryDate = document.getElementById("deliveryDate").value;

		let button = document.getElementById("submit").value;

		if (productName.length < 3 || productName.length > 20) {
			document.getElementById("productNameError").innerHTML = "Please enter product name.";
			return false;
		}
		else {
			document.getElementById("productNameError").innerHTML = "";
		}

		if (productManuCom.length < 3 || productManuCom.length > 20) {
			document.getElementById("productManuComError").innerHTML = "Please enter Manufacture company.";
			return false;
		}
		else {
			document.getElementById("productManuComError").innerHTML = "";
		}

		if (companyLocation.length < 3 || companyLocation.length > 20) {
			document.getElementById("companyLocationError").innerHTML = "Please enter location.";
			return false;
		}
		else {
			document.getElementById("companyLocationError").innerHTML = "";
		}

		if (seller === "") {
			document.getElementById("sellerError").innerHTML = "Please select seller.";
			return false;
		}
		else {
			document.getElementById("sellerError").innerHTML = "";
		}

		if (quantity <= 0) {
			document.getElementById("quantityError").innerHTML = "Please enter valid quantity.";
			return false;
		}
		else {
			document.getElementById("quantityError").innerHTML = "";
		}

		if (cost <= 0) {
			document.getElementById("costError").innerHTML = "Please enter cost.";
			return false;
		}
		else {
			document.getElementById("costError").innerHTML = "";
		}

		if (orderDate == null) {
			document.getElementById("orderDateError").innerHTML = "Please enter order date.";
			return false;
		}
		else {
			document.getElementById("orderDateError").innerHTML = "";
		}

		button.removeAttribute('submitButton');
		return true;

	}

	function productName() {
		let productName = document.getElementById("productName").value;
		let button = document.getElementById("submit").value;

		if (productName.value.length > 3 && productName.value.length < 20) {
			document.getElementById("productNameError").innerHTML = "";
			button.removeAttribute("disabled");
		}
		else {
			document.getElementById("productNameError").innerHTML = "Please enter product name.";
			button.setAttribute("disabled", "");
			return;
		}
	}

	function productManuCom() {
		let productManuCom = document.getElementById("productManuCom").value;
		let button = document.getElementById("submit").value;

		if (productManuCom.value.length > 3 && productManuCom.value.length < 20) {
			document.getElementById("productManuComError").innerHTML = "";
			button.removeAttribute("disabled");
		}
		else {
			document.getElementById("productManuComError").innerHTML = "Please enter Manufacture company.";
			button.setAttribute("disabled", "");
			return;
		}
	}

	function companyLocation() {
		let companyLocation = document.getElementById("companyLocation").value;
		let button = document.getElementById("submit").value;

		if (companyLocation.value.length > 3 && companyLocation.value.length < 20) {
			document.getElementById("companyLocationError").innerHTML = "";
			button.removeAttribute("disabled");
		}
		else {
			document.getElementById("companyLocationError").innerHTML = "Please enter location.";
			button.setAttribute("disabled", "");
			return;
		}
	}
	</script>
</body>
</html>