<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cafe Suze</title>
</head>
<body>
	Welcome to Cafe Suze!
	<form action="getOrderServlet" method="post">
	<br>Please enter your name to begin your order: 
	<input type="text" name="customerName" size="11">
	<br>Select a drink: 
	<select name="orderMenu">
	<option value="Mocha">Mocha</option>
	<option value="Java" selected>Java</option>
	<option value="Latte">Latte</option>
	</select>
	<br><input type="submit" value="Submit Order" />
	</form>
</body>
</html>