<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body style="text-align:center">
<% request.setCharacterEncoding("EUC-KR"); %>
	<h2>
		forward action �� sendRedirect() ���
	</h2>
	<br>
	<hr >
	
		���� ���̴� ȭ���� page_control_end.jsp ���� ����� ��� �Դϴ�.
		<hr>
		�̸� :
		<%=request.getParameter("username")%><br> 
		��ȭ��ȣ :
		<%=request.getParameter("tel")%>
	
</body>
</html>