import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc;
		
		sc = new Scanner(System.in);
		int num1 ;//ù��° ��
		int num2 ;//�ι�° ��
		int num3 = 0 ;//������ �� ��
		          // ans�� ����ϴ� ��
				  // ch�� �����ȣ
		String ans="Y";
		
		
		do {
			System.out.print("���ڸ� �Է��ϼ���.");
			num1 = sc.nextInt();
		
		    System.out.println("�����ڸ� �Է��ϼ���.");
		    String ch = sc.next();
		
		    if( ch.equals("+")||ch.equals("/")||ch.equals("*")||ch.equals("-") ) {
		    		System.out.print("���ڸ� �Է��ϼ���.");
		    		num2 = sc.nextInt();
		
		    		if( ch.equals("+")) {
		    			num3 = (num1 + num2);}
		    		else if(ch.equals("-")) {
		    			num3 = num1 - num2;}
		    		else if(ch.equals("*")) {
		    			num3 = num1 * num2 ;}
		    		else if(ch.equals("/")) {
		    			num3 = num1 / num2 ;}
		    		System.out.println(num1+ch+num2+"="+num3);
		   
		    System.out.println("����ؼ� ����� �Ͻðڽ��ϱ�?");
			    	ans = sc.next();}
				    	
		    else {
		    	System.out.println("�����ȣ�� ����ϼ���.");} 	
		    
		}while(ans.equals("Y")||ans.equals("y"));
	}
}


	
