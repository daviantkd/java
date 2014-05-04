<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List</title>
</head>
<body>
	<h1>Product List</h1>
	<a href="product/create">Create new product</a>
	<br>
	<br>
	<table border="1">
		<thead>
			<tr>
				<td>PRODUCT ID</td>
				<td>PRODUCT NAME</td>
				<td>CATEGORY</td>
				<td>FLAG</td>
				<td>ACTIONS</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${products }">
				<tr>
					<td>${product.productId }</td>
					<td>${product.productName }</td>
					<td>${product.category.categoryId }</td>
					<td>${product.flag }</td>
					<td><a href="product/details/${product.productId }">Details</a>
						| <a href="product/edit/${product.productId }">Edit</a> | <a
						href="product/delete/${product.productId }">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>