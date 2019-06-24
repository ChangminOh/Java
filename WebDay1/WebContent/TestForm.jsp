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
			<center>request 테스트 폼</center>
		</h2>
		<br>
		<br>
		<hr>
		<br>
		<br>

		<table align="center" border=1 cellpadding="0" cellspacing="0">
			<tr>
				<td>이름</td>
				<td><input type="text" name="id"></td>
			</tr>

			<tr>
				<td>직업</td>   
				<td><select name="job">                                                   <%--//JOB 에 직업을 할당  --%>
						<option name="job" value="전문직">전문직</option>
						<option name="job" value="비전문직">비전문직</option>
				</select></td>
			</tr>

			<tr>
				<td>관심분야</td>																 <%--//inter 에 직업을 할당  --%>
				<td><input type="checkbox" name="inter" value="정치">정치 <input
					type="checkbox" name="inter" value="사회">사회 <input
					type="checkbox" name="inter" value="정보통신">정보통신</td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value="확인">
					<input type="reset" vlaue="취소"></td>
			</tr>



		</table>
	</form>
</body>
</html>