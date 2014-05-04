<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	<h1>Product Details</h1>
	<table border="1">
		<tr>
			<td>Product Id</td>
			<td>${product.productId }</td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td>${product.productName }</td>
		</tr>
		<tr>
			<td>Category</td>
			<td>${product.category.categoryName }</td>
		</tr>
		<tr>
			<td>Flag</td>
			<td>${product.flag }</td>
		</tr>
	</table>
	<br />
	<a href="../../product">Back to product list</a>
</body>
</html>