<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Details</title>
</head>
<body>
	<h1>Category Details</h1>
	<table border="1">
		<tr>
			<td>CATEGORY ID</td>
			<td>${category.categoryId}</td>
		</tr>
		<tr>
			<td>CATEGORY NAME</td>
			<td>${category.categoryName}</td>
		</tr>
		<tr>
			<td>FLAG</td>
			<td>${category.flag}</td>
		</tr>
	</table>
	<br />
	<a href="../../category">Back to category list</a>
</body>
</html>