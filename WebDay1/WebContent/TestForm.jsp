<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<script language=javascript>
	document.cookie = "test=OK.";
</script>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form name="test" action="TestForm1.jsp" method="post">
		<h2>
			<center>request �׽�Ʈ ��</center>
		</h2>
		<br>
		<br>
		<hr>
		<br>
		<br>

		<table align="center" border=1 cellpadding="0" cellspacing="0">
			<tr>
				<td>�̸�</td>
				<td><input type="text" name="id"></td>
			</tr>

			<tr>
				<td>����</td>   
				<td><select name="job">                                                   <%--//JOB �� ������ �Ҵ�  --%>
						<option name="job" value="������">������</option>
						<option name="job" value="��������">��������</option>
				</select></td>
			</tr>

			<tr>
				<td>���ɺо�</td>																 <%--//inter �� ������ �Ҵ�  --%>
				<td><input type="checkbox" name="inter" value="��ġ">��ġ <input
					type="checkbox" name="inter" value="��ȸ">��ȸ <input
					type="checkbox" name="inter" value="�������">�������</td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value="Ȯ��">
					<input type="reset" vlaue="���"></td>
			</tr>



		</table>
	</form>
</body>
</html>