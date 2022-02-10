<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Receipt</title>
</head>
<body>
<p>
	Order for ${coffeeOrder.getCustomer()}: <br />
	Drink: ${coffeeOrder.getDrink()} <br />
	Price of drink: $${coffeeOrder.getPrice()} <br />
	Total Due (with tax): $${coffeeOrder.orderTotal()} <br />
</p>
<a href="index.jsp">Begin a new order?</a>
</body>
</html>