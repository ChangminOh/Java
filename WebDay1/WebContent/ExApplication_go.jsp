<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body style="text-align:center">
		<%= application.getAttribute("username") %><br>
		<% Object aa = application.getAttribute("count");
		
				int bb = (Integer) aa;
				
				if(bb==1){
					out.print("count : "+bb);
					bb++;
					application.setAttribute("count", bb);
					
				}else {
					out.print("count : "+bb);
					bb++;
					application.setAttribute("count", bb);
				}
		
		
		%>
</body>
</html>