/*
function validate() {
			let name = document.getElementById("name").value;
			let field = document.getElementById("field").value;
			let experience = document.getElementById("experience").value;
			let country = document.getElementById("country").value;
			let achivement = document.getElementById("achivement").value;
			
			let button=document.getElementById("submit").value;

			
			if (name.length < 3 || name.length > 20) {
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
*/