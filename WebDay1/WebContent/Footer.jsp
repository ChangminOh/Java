<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head><title>include_action.jsp</title></head>
<body>
<h2>include_action.jsp ���� footer.jsp ȣ��</h2>
<HR>
include_action.jsp ���� ����� �޼��� �Դϴ�.<br>

<jsp:include page="Footer1.jsp">
	<jsp:param name = "email" value="test@test.net" />
	<jsp:param name = "tel" value = "000-0000-0000"/>
</jsp:include>

</body>
</html>