<%@page import="java.util.HashMap"%>
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
		HashMap<String, String> hsmp =(HashMap) session.getAttribute("sess");
		String name = "";
		String email = "";
		
		if(hsmp!=null){
			name = hsmp.get("name");
			email = hsmp.get("email");
		} else {
			name = null;
			email = null;
		}
%>
<table>
<tr>
<td>Name : <%=name %></td>
</tr>
<tr>
<td>Email : <%=email %></td>
</tr>
</table>
</body>
</html>