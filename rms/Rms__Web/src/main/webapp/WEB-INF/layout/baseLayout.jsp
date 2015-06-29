<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
 <html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
  <table align="center" width="800" border="2">
<tr><td colspan="3"><tiles:insertAttribute name="header" /></td></tr>
<tr><td><tiles:insertAttribute name="body" /></td></tr>
<tr><td colspan="3"><tiles:insertAttribute name="footer" /></td></tr>
</table>
</body>
</html>