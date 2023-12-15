<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Page</title>
    <link rel="stylesheet" href="style.css">
    
    <script type="text/javascript">
    	function validate(){
    		let productName = document.myForm.productName.value;
    		let price = document.getElementById("price").value;
    		let description = document.myForm.description.value;
    		let select = document.getElementById("type");
    		let quantity = document.getElementById("quantity").value;
    		
    		if (productName==null || productName==""){  
    			  alert("Name can't be blank");  
    			  return false;  
    		}
    		else if(productName.length < 3){
    			alert(productName + " is short valid");
    			return false;
    		}
    		else if(productName.length > 20){
    			alert(productName + " is too long valid");
    			return false;
    		}
    		
    		else if(price == ""){
    			alert("price is mandatory");
    			return false;
    		}
    		else if(price <= 0){
    			alert(price + " is invalid");
    			return false;
    		}
    		
    		else if(quantity == ""){
    			alert("Quantity is needed");
    			return false;
    		}
    		else if(quantity <= 0){
    			alert(quantity + ". Must be above 0.");
    			return false;
    		}
    		
    		if (description==null || description==""){  
  			  alert("description can't be blank");  
  			  return false;  
  		    }
  		    else if(description.length < 10 || description.length > 200){
  			  alert("description is not valid");
  			  return false;
  		    }
    		
    		else{
    			return true;
    		}
    		
    	}
    
    </script>
</head>

<body>
    <header>
        <nav id="navbar">
            <div class="left">Santosh</div>
            <div class="right">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                </ul>
            </div>
        </nav>
    </header>

    <main>
        <div id="container">
            <h1>Product Information</h1>
            <form class="form" name="myForm" action="valid" method="post" onsubmit="return validate()">
                <div class="input-box">
                    <input type="text" id="productName" name="productName" placeholder="Enter product name">
                </div>
                
                <div class="input-box">
                    <select name="type" class="input-box" id="type" >
                        <option disabled="disabled">Select product type</option>
                        <option >Clothes</option>
                        <option >Accessories</option>
                        <option >Vegetables</option>
                        <option >Foot wears</option>
                    </select>
                </div>

                <div class="input-box">
                    <input type="number" id="price" name="price" placeholder="Product price" min="0">
                </div>
                
                <div class="input-box">
                    <input type="text" name="brand" placeholder="Product brand">
                </div>
                
                <div class="input-box">
                    <input type="number" name="quantity" id="quantity" placeholder="Product quantity">
                </div>
                
                <div class="input-box">
                    <textarea rows="4" cols="" name="description" placeholder="Decription"></textarea>
                </div>

                <button type="submit">Submit</button>
            </form>
        </div>
    </main>

</body>

</html>