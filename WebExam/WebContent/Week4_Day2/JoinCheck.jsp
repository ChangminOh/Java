<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8"); %>
    <jsp:useBean id="join" class="Beans.JoinBean" scope="page"></jsp:useBean>
    <jsp:setProperty name="join" property="name" />
    <jsp:setProperty name="join" property="pw1" />
    <jsp:setProperty name="join" property="pw2" />
    <jsp:setProperty name="join" property="email" />
    <jsp:setProperty name="join" property="num1" />
    <jsp:setProperty name="join" property="num2" />
    <jsp:setProperty name="join" property="year" />
    <jsp:setProperty name="join" property="month" />
    <jsp:setProperty name="join" property="day" />
    <jsp:setProperty name="join" property="inter" />
    <jsp:setProperty name="join" property="intro" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:getProperty property="name" name="join"/>
<jsp:getProperty property="pw1" name="join"/>
<jsp:getProperty property="pw2" name="join"/>
<jsp:getProperty property="email" name="join"/>
<jsp:getProperty property="num1" name="join"/>
<jsp:getProperty property="num2" name="join"/>
<jsp:getProperty property="year" name="join"/>
<jsp:getProperty property="month" name="join"/>
<jsp:getProperty property="day" name="join"/>
<% for(String i : join.getInter() ){
	out.print(i);
}
	%>

<jsp:getProperty property="intro" name="join"/>

</body>
</html>