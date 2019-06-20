

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalServlet
 */

public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int num1,num2;
		int result;
		String op;
		// Ŭ���̾�Ʈ ����� ���޵� �������� ���� mime type�� ĳ���ͼ�
		response.setContentType("text/html; charset=euc-kr");
		
		//Ŭ���̾�Ʈ ������ ���� ��� ��Ʈ�� Ȯ��
		PrintWriter out = response.getWriter();
		
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		op = request.getParameter("op");
		
		result = cal(num1,num2,op);
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>����</TITLE></HEAD>");
		out.println("<BODY><center>");
		out.println("<H2>�����</H2>");
		out.println("<HR>");
		out.println(num1 + " " + op + " " + num2 +" = "+ result);
	}
	
	public int cal(int num1, int num2, String op) {
		int result = 0;
		
		if(op.equals("+")) {
			result = num1 + num2;
		}else if(op.equals("-")) {
			result = num1 - num2;
		}else if(op.equals("/")) {
			result = num1 / num2;
		}else if(op.equals("*")) {
			result = num1 * num2;
		}
		return result;
		
	}

}
