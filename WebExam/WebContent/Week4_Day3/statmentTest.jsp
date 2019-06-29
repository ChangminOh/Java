<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*"%>
    <%@ page import="javax.sql.*"%>
    <%@ page import="javax.naming.*"%>
    
    <%
    	Connection conn = null;
    	String sql="Insert into student (num,name) values (?,?)";
    	
    	try {
    		Context init = new InitialContext();
    		DataSource ds = (DataSource) init.lookup
    							("java:comp/env/jdbc/OracleDB");
    		conn = ds.getConnection();
    		PreparedStatement stmt=conn.prepareStatement(sql);
    		
    		for(int i=7; i<=10;i++){
    			stmt.setInt(1, i);
    			switch(i){
    				case 7 : stmt.setString(2, "유효진"); break;
    				case 8 : stmt.setString(2, "김영인"); break;
    				case 9 : stmt.setString(2, "김석준"); break;
    				case 10 : stmt.setString(2, "오창민"); 
    				
    			}
    			
    			if(stmt.executeUpdate()!=0){
    				out.println("<h3>"+i+"번 레코드를 등록하였습니다. </h3>");
    			}
    			
    		}
    	
    		
    	}catch(Exception e){
    		out.println("<h3>레코드가 등록에 실패하였습니다.</h3>");
    		e.printStackTrace();
    	}
    
    
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>