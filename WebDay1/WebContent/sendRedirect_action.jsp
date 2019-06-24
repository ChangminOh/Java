<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% request.setAttribute("username", request.getParameter("username") ); %>
<% request.setAttribute("tel", 000-0000-0000); %>
<% response.sendRedirect("page_foward_test.jsp"); %>


</body>
</html>