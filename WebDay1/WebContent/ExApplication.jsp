<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@ page import = "java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body style = "text-align: center">
	
		<hr>
		1. 서버정보 :
		<%=application.getServerInfo()%><br> 2. 서블릿 API 버전정보 :
		<%=application.getMajorVersion() + "." + application.getMinorVersion()%><br> 3. application.jsp 화일의 실제경로
		:
		<%=application.getRealPath("ExApplication.jsp")%>
		<br>

		<hr>
		setAttribute 로 username 변수에 "홍길동" 설정
		
		<p>
			<%
				application.setAttribute("username", "홍길동");         
				application.log("username=홍길동");
				application.setAttribute("count", 1);
			%>
		<a href = "ExApplication_go.jsp">확인하기</a></p>
	
</body>
</html>