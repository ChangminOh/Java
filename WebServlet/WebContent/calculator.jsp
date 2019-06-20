<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>


</head>
<body>

<form name = "cal" action="/WebServlet/cals"  method = "post" > 

	<input type = "text" NAME="num1" width="200" size="5">
	<select NAME="op">
	<option >+</option>
	<option >-</option>
	<option >*</option>
	<option >/</option>
	</select>
	<input type = "text" NAME="num2" width="200" size="5">
	<input type ="submit" value="계산" >
	<input type = "reset" value="다시입력">
	

</form>

</body>
</html>