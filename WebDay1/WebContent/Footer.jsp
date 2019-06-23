<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head><title>include_action.jsp</title></head>
<body>
<h2>include_action.jsp 에서 footer.jsp 호출</h2>
<HR>
include_action.jsp 에서 출력한 메세지 입니다.<br>

<jsp:include page="Footer1.jsp">
	<jsp:param name = "email" value="test@test.net" />
	<jsp:param name = "tel" value = "000-0000-0000"/>
</jsp:include>

</body>
</html>