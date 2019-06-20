import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc;
		
		sc = new Scanner(System.in);
		int num1 ;//첫번째 값
		int num2 ;//두번째 값
		int num3 = 0 ;//연산을 한 값
		          // ans는 대답하는 값
				  // ch는 연산기호
		String ans="Y";
		
		
		do {
			System.out.print("숫자를 입력하세요.");
			num1 = sc.nextInt();
		
		    System.out.println("연산자를 입력하세요.");
		    String ch = sc.next();
		
		    if( ch.equals("+")||ch.equals("/")||ch.equals("*")||ch.equals("-") ) {
		    		System.out.print("숫자를 입력하세요.");
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
		   
		    System.out.println("계속해서 계산을 하시겠습니까?");
			    	ans = sc.next();}
				    	
		    else {
		    	System.out.println("연산기호만 사용하세요.");} 	
		    
		}while(ans.equals("Y")||ans.equals("y"));
	}
}


	
