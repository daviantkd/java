<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category List</title>
</head>
<body>
	<h1>Category List</h1>
	<a href="category/create">Create new category</a>
	<br>
	<br>
	<table border="1">
		<thead>
			<tr>
				<td>CATEGORY ID</td>
				<td>CATEGORY NAME</td>
				<td>FLAG</td>
				<td>ACTIONS</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="category" items="${categories }">
				<tr>
					<td>${category.categoryId }</td>
					<td>${category.categoryName }</td>
					<td>${category.flag }</td>
					<td><a href="category/details/${category.categoryId }">Details</a>
						| <a href="category/edit/${category.categoryId }">Edit</a> | <a
						href="category/delete/${category.categoryId }">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>