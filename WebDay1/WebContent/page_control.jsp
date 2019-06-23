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
	
	<form action="foward_action2.jsp" method="post">
		forward action : <input type="text" name="username"><input
			type="submit"> <br>
	</form>
	
	<form action="sendRedirect_action.jsp" method="post">
		sendRedirect : <input type="text" name="username"><input
			type="submit">
	</form>
	

	<form action="Assignment.jsp" method="post">
		넘겨보자 : <input type="text" name="username"><input type="submit">
	</form>
	
</body>
</html>