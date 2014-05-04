<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Category</title>
</head>
<body>
	<h1>Edit Category</h1>
	<form:form action="edit" method="POST" modelAttribute="category">
		<form:hidden path="categoryId" />
		<table border="1">
			<tr>
				<td>CATEGORY NAME</td>
				<td><form:input path="categoryName" /></td>
			</tr>
			<tr>
				<td>FLAG</td>
				<td><form:checkbox path="flag" /></td>
			</tr>
		</table>
		<input type="submit" value="SAVE" />
	</form:form>
	<a href="../../category">Back to category list</a>
</body>
</html>