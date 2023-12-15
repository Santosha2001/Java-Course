<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Success Page</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <header>
        <nav id="navbar">
            <div class="left">Santosh</div>
            <div class="right">
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="Product.jsp">Product</a></li>
                </ul>
            </div>
        </nav>
    </header>
    
    <div>
    	<h4>product name: ${item.productName}</h4>
    	<h4>product type: ${item.type}</h4>
    	<h4>product brand: ${item.brand}</h4>
    	<h4>product price: ${item.price}</h4>
    	<h4>product quantity: ${item.quantity}</h4>
    	<h4>product description: ${item.description}</h4>
    	<h4>total: ${total}</h4>
    </div>
</body>

</html>