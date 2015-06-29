<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="loginuser.do" method="post"
			modelAttribute="LoginModel">
			<h4>Login Page</h4>
			<table>
				<tr>
					<td>
					<form:errors path="username"></form:errors>
					<label>First Name:</label></td>
					<td><form:input path="username" id="username" /></td>
				</tr>
				<tr>
					<td>
					<form:errors path="password" ></form:errors>
					<label>Last Name:</label></td>
					<td><form:input path="password" id="password" /></td>
				</tr>
				<tr>
					<td><input type="Submit" value="Register"></td>
				</tr>
				</table>
				</form:form>
</body>
</html>