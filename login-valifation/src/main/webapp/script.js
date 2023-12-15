/**
 * 
 */
	

function validate() {
	var name = document.getElementById("name").value;
	var number = document.getElementById("number");
	var email = document.getElementById("email").value;
	var date = document.getElementById("date");
	var location = document.getElementById("location").value;
	var password = document.getElementById("password").value;
	var conpassword = document.getElementById("conpassword").value;

	var button = document.getElementById("submit");

	if (name.length < 3 || name.length > 20) {
		document.getElementById("nameError").innerHTML = "*Please enter the valid name"
		return false;
	}
	else {
		document.getElementById("nameError").innerHTML = "";
	}

	if (number.value.length !== 10) {
		document.getElementById("numberError").innerHTML = "*Please enter the valid number"
		return false;
	}
	else {
		document.getElementById("numberError").innerHTML = "";
	}


	if (email.indexOf("@") < 0 || email.indexOf(".") < 0) {
		document.getElementById("mailError").innerHTML = "*Please enter valid email"
		return false;
	}
	else if (email.indexOf("@") == 0) {
		document.getElementById("mailError").innerHTML = "*Please enter valid email"
		return false;
	}
	else if (email.lastIndexOf(".") == email.length - 1) {
		document.getElementById("mailError").innerHTML = "*Please enter valid email"
		return false;
	}
	else {
		document.getElementById("mailError").innerHTML = "";
	}


	var date = new Date(date);
	if (date.getFullYear() < 1000 || date.getFullYear() > 3000) {
		document.getElementById("dateError").innerHTML = "*Please enter valid date"
		return false;
	}

	else if (date.getMonth() < 0 || date.getMonth() > 11) {
		document.getElementById("dateError").innerHTML = "*Please enter valid date"
		return false;
	}

	else if (date.getDate() < 1 || date.getDate() > 31) {
		document.getElementById("dateError").innerHTML = "*Please enter valid date"
		return false;
	}
	else {
		document.getElementById("dateError").innerHTML = ""
	}


	if (location.length < 3 || location.length > 20) {
		document.getElementById("locationError").innerHTML = "*Please enter the valid location"
		return false;
	}
	else {
		document.getElementById("locationError").innerHTML = "";
	}


	if (password.length < 3 || password.length > 20) {
		document.getElementById("passError").innerHTML = "*Please enter the valid password"
		return false;
	}
	else {
		document.getElementById("passError").innerHTML = "";
	}


	if (conpassword.length < 3 || conpassword.length > 20) {
		document.getElementById("conpassError").innerHTML = "*Please re-enter password"
		return false;
	}
	else if (conpassword != password) {
		document.getElementById("conpassError").innerHTML = "*Password mismatch"
		return false;
	}
	else {
		document.getElementById("conpassError").innerHTML = "";
	}

	button.removeAttribute('submitButton');
	return true;
}


function Name(event) {

	var name = document.getElementById("name");
	var btn = document.getElementById("submit");

	if (name.value.length > 3 && name.value.length < 20) {
		document.getElementById("nameError").innerHTML = ""
		btn.removeAttribute("disabled")
	}

	else {
		document.getElementById("nameError").innerHTML = "Please enter the valid name here..";
		btn.setAttribute("disabled", "");
		return;
	}

}


function Number(event) {

	var number = document.getElementById("number");
	var btn = document.getElementById("submit");

	if (number.value.length === 10) {
		document.getElementById("numberError").innerHTML = ""
		btn.removeAttribute("disabled")
	}

	else {
		document.getElementById("numberError").innerHTML = "Please enter the valid number";
		btn.setAttribute("disabled", "");
		return;
	}
}


function Email(event) {

	var email = document.getElementById("email");
	var btn = document.getElementById("submit");

	if (email.indexOf("@") > 0 || email.indexOf(".") > 0) {
		document.getElementById("mailError").innerHTML = ""
		btn.removeAttribute("disabled")
	}
	else if (email.indexOf("@") != 0) {
		document.getElementById("mailError").innerHTML = ""
		btn.removeAttribute("disabled")
	}
	else if (email.lastIndexOf(".") != email.length - 1) {
		document.getElementById("mailError").innerHTML = ""
		btn.removeAttribute("disabled")
	}
	else {
		document.getElementById("mailError").innerHTML = "Please enter the valid email";
		btn.setAttribute("disabled", "");
		return;
	}
}

function Location() {
	var location = document.getElementById("location");
	var btn = document.getElementById("submit");

	if (location.value.length > 3 || location.value.length < 20) {
		document.getElementById("locationError").innerHTML = "";
		btn.removeAttribute("disabled")
	}
	else {
		document.getElementById("locationError").innerHTML = "Please enter the valid location";
		btn.setAttribute("disabled", "");
		return;
	}
}

function cap() {
	var captcha = document.getElementById("captcha");
	var btn = document.getElementById("submit");

}

















