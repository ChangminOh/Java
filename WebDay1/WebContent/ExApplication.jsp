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
		1. �������� :
		<%=application.getServerInfo()%><br> 2. ���� API �������� :
		<%=application.getMajorVersion() + "." + application.getMinorVersion()%><br> 3. application.jsp ȭ���� �������
		:
		<%=application.getRealPath("ExApplication.jsp")%>
		<br>

		<hr>
		setAttribute �� username ������ "ȫ�浿" ����
		
		<p>
			<%
				application.setAttribute("username", "ȫ�浿");         
				application.log("username=ȫ�浿");
				application.setAttribute("count", 1);
			%>
		<a href = "ExApplication_go.jsp">Ȯ���ϱ�</a></p>
	
</body>
</html>