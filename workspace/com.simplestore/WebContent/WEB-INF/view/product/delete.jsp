<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Product</title>
</head>
<body>
	<h1>Are you sure you want to delete this product?</h1>
	<table border="1">
		<tr>
			<td>CATEGORY</td>
			<td>${product.category.categoryName }</td>
		</tr>
		<tr>
			<td>PRODUCT ID</td>
			<td>${product.productId }</td>
		</tr>
		<tr>
			<td>PRODUCT NAME</td>
			<td>${product.productName }</td>
		</tr>
		<tr>
			<td>FLAG</td>
			<td>${product.flag }</td>
		</tr>
	</table>
	<a href="../../product/confirmDelete/${product.productId }">DELETE</a>
	|
	<a href="../../product">Back to product list</a>
</body>
</html>