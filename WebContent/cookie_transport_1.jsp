
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
		Cookie nm = new Cookie("nm", request.getParameter("nm"));
		Cookie em = new Cookie("em", request.getParameter("em"));

		// set expiry date
		nm.setMaxAge(60*60*24);
		em.setMaxAge(60*60*24);

 		// Add both the cookies in the response header.
		response.addCookie(nm);
		response.addCookie(em);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>Name : </td>
<td><%=request.getParameter("nm") %>
</tr>
<tr>
<td>email : </td>
<td><%=request.getParameter("em") %>
</tr>
</table>
</body>
</html>