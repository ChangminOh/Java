<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%  String username = request.getParameter("username"); %>
<%  String tel = "000-0000-0000"; %>

<% response.sendRedirect("page_foward_test.jsp?username="+username+"&tel="+tel); %>


</body>
</html>