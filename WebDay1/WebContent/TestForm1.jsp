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
		request.setCharacterEncoding("EUC-KR"); // �ѱ��� ���� �� �հ� ���ڵ� ����
	%>

	<h2>
		<center>request �׽�Ʈ ��� -1</center>
	</h2>
	<br>
	<br>
	<hr>
	<br>
	<br>

	<table align="center" cellpadding="0" cellspacing="0">
		<tr>
			<td>�̸�</td>
			<td><%=request.getParameter("id")%></td>
		</tr>
		<tr>
			<td>����</td>
			<td><%=request.getParameter("job")%></td>
		</tr>
		<tr>
			<td>���ɺо�</td>
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
	<h2>request �׽�Ʈ ��� -2</h2>
	<table  align="center" cellpadding="0" cellspacing="0"><tr><td>
	
	1. Ŭ���̾�Ʈ IP�ּ� : <%= request.getRemoteAddr() %> <BR>
	2. ��û �޼��� : <%= request.getMethod() %> <BR>
	<% Cookie cookie[] = request.getCookies(); %>
	3. <%= cookie[1].getName()%> �� ������ ��Ű��:
	<%= cookie[1].getValue()%> <BR>
	4. �������� : <%= request.getProtocol() %>
	
	</td></tr>
	
	</table>
</body>
</html>