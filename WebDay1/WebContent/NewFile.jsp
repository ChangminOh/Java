<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<table border = 1>
	
	<tr>
	<td> </td>
 	<% for(int i=0;i<8;i++){ 
		out.print("<td>"+(i+2)+"단 </td>");}%>
	</tr> 

		<% for( int i=1;i<10;i++){
				out.print("<tr><td>" + i + "</td>");
			for( int j=2;j<10;j++){
				out.print("<td>"+j+"*"+i+"="+ (i*j) +"</td>");
			}
				out.print("</tr>");
			
			}  %>
</table>

</body>
</html>