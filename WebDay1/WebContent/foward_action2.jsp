<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("EUC-KR"); %>
<jsp:forward  page= "page_foward_test.jsp">
	<jsp:param  name = "tel" value = "000-0000-0000"/>
</jsp:forward>
	
</body>
</html>