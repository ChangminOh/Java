<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*"%>
    <%@ page import="javax.sql.*"%>
    <%@ page import="javax.naming.*"%>
    
    <%
    	Connection conn = null;
    	String sql="select * from student";
    	
    	try {
    		Context init = new InitialContext();
    		DataSource ds = (DataSource) init.lookup
    							("java:comp/env/jdbc/OracleDB");
    		conn = ds.getConnection();
    		PreparedStatement pstmt=conn.prepareStatement(sql);
    		ResultSet rs = pstmt.executeQuery();
    		
    		
    		while(rs.next()){
    			out.println("<h3>"+rs.getInt(1)+","+rs.getString(2)+"</h3>");
    		}

    		rs.close();
    		conn.close();
    		
    		
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