import java.util.Scanner;
public class CalHW {
	
	//Field 객체가 생성될 때 생성되는 변수
	private int num1;
	private int num2;
	private String ch;
	
	
	//Method 변수에 값을 할당하기 위한 method
	public void setNum1(int a) {num1 = a ;}
	public void setNum2(int b) {num2 = b ;}
	public void setCh(String c) {ch = c ;}
	
	//Getter 값을 불러오기 위한 것
	public int getNum1() {return num1;}
	public int getNum2() {return num2;}
	public String getCh() {return ch ;}
	
	public static void main(String[] args) {
		CalHW chl = new CalHW() ;// 객체 생성 및 동적메모리로 할당
		Scanner sc;
		sc = new Scanner(System.in);//sc를 Scanner로 설정
		
		int num3 = 0 ;//연산을 한 값
		          // ans는 대답하는 값
				  // ch는 연산기호
		String ans="Y";
		
		
		do {
			System.out.print("숫자를 입력하세요.");
			int num1 = sc.nextInt();
		
		    System.out.println("연산자를 입력하세요.");
		    String ch = sc.next();
		
		    if( ch.equals("+")||ch.equals("/")||ch.equals("*")||ch.equals("-") ) {
		    		System.out.print("숫자를 입력하세요.");
		    		int num2 = sc.nextInt();
		
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
	

