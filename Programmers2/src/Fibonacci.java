import java.util.ArrayList;

public class Fibonacci {

	
	public int solution(int n) {
		
			  
		long num1 =0;
		long num2 =1;
		long num3 = 0 ;
		for(int i=2;i<=n;i++) {
			num3 = num1 + num2;
			num1=num2;num2=num3; 
		}
		
		
		
	      int answer = (int) num3%1234567;
	      return answer;
	  }
}
