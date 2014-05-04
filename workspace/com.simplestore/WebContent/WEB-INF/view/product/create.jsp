<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Product</title>
</head>
<body>
	<h1>Create Product</h1>
	<form:form action="create" method="POST" modelAttribute="product">
		<table border="1">
			<tr>
				<td>CATEGORY</td>
				<td><form:select path="category.categoryId">
						<form:option value="" label="SELECT CATEGORY" />
						<form:options items="${categories }" itemValue="categoryId"
							itemLabel="categoryName" />
					</form:select></td>
			</tr>
			<tr>
				<td>PRODUCT NAME</td>
				<td><form:input path="productName" /></td>
			</tr>
			<tr>
				<td>FLAG</td>
				<td><form:checkbox path="flag" /></td>
			</tr>
		</table>
		<input type="submit" value="CREATE">
	</form:form>
	<a href="../product">Back to product list</a>
</body>
</html>