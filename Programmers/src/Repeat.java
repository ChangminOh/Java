import java.util.Scanner;

public class Repeat {
	
	String su;
	String bak;
	String com;
	
	public Repeat() {
		
		su = "수";
		bak = "박";
		com = "";
		
	}
	
	public void re(int num1) {
		
		for(int i=1; i<=num1; i++) {
			
			if(i%2==1) { com+=su;}
			else if(i%2==0) {com+=bak;}
			
		}
		System.out.println(com);
		
		
	}
	
	public static void main(String[] args) {
		
		Repeat repeat = new Repeat();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("길이를 입력하쇼.");
		repeat.re(sc.nextInt());
		
	}
	

}
