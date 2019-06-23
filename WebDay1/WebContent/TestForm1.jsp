<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		request.setCharacterEncoding("EUC-KR"); // 한글을 읽을 수 잇게 인코딩 설정
	%>

	<h2>
		<center>request 테스트 결과 -1</center>
	</h2>
	<br>
	<br>
	<hr>
	<br>
	<br>

	<table align="center" cellpadding="0" cellspacing="0">
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("id")%></td>
		</tr>
		<tr>
			<td>직업</td>
			<td><%=request.getParameter("job")%></td>
		</tr>
		<tr>
			<td>관심분야</td>
			<td>
				<%
					String[] arr = request.getParameterValues("inter");

					for (String i : arr) {
						out.println(i);
					}
				%>
			</td>
		</tr>
	</table>
	
	<hr>
	<h2>request 테스트 결과 -2</h2>
	<table  align="center" cellpadding="0" cellspacing="0"><tr><td>
	
	1. 클라이언트 IP주소 : <%= request.getRemoteAddr() %> <BR>
	2. 요청 메서드 : <%= request.getMethod() %> <BR>
	<% Cookie cookie[] = request.getCookies(); %>
	3. <%= cookie[1].getName()%> 에 설정된 쿠키값:
	<%= cookie[1].getValue()%> <BR>
	4. 프로토콜 : <%= request.getProtocol() %>
	
	</td></tr>
	
	</table>
</body>
</html>