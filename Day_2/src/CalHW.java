import java.util.Scanner;
public class CalHW {
	
	//Field ��ü�� ������ �� �����Ǵ� ����
	private int num1;
	private int num2;
	private String ch;
	
	
	//Method ������ ���� �Ҵ��ϱ� ���� method
	public void setNum1(int a) {num1 = a ;}
	public void setNum2(int b) {num2 = b ;}
	public void setCh(String c) {ch = c ;}
	
	//Getter ���� �ҷ����� ���� ��
	public int getNum1() {return num1;}
	public int getNum2() {return num2;}
	public String getCh() {return ch ;}
	
	public static void main(String[] args) {
		CalHW chl = new CalHW() ;// ��ü ���� �� �����޸𸮷� �Ҵ�
		Scanner sc;
		sc = new Scanner(System.in);//sc�� Scanner�� ����
		
		int num3 = 0 ;//������ �� ��
		          // ans�� ����ϴ� ��
				  // ch�� �����ȣ
		String ans="Y";
		
		
		do {
			System.out.print("���ڸ� �Է��ϼ���.");
			int num1 = sc.nextInt();
		
		    System.out.println("�����ڸ� �Է��ϼ���.");
		    String ch = sc.next();
		
		    if( ch.equals("+")||ch.equals("/")||ch.equals("*")||ch.equals("-") ) {
		    		System.out.print("���ڸ� �Է��ϼ���.");
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
		   
		    System.out.println("����ؼ� ����� �Ͻðڽ��ϱ�?");
			    	ans = sc.next();}
				    	
		    else {
		    	System.out.println("�����ȣ�� ����ϼ���.");} 	
		    
		}while(ans.equals("Y")||ans.equals("y"));
	}

		
	}
	

