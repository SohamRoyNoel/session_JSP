<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		String msg = request.getParameter("status");
		if (msg == null){
			msg = "";
		}
%>

		<%=msg %>
<form action="url_rewritting_jsp_servlet" method="post">
<table>
<tr>
<td>Name</td>
<td><input type="text" name="nm"></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="em"></td>
</tr>
<tr>
<td><input type="submit" value="SUBMIT"></td>
</tr>
</table>
</form>
</body>
</html>