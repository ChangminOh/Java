import java.util.Scanner;

public class Abc {
	
		  public int solution(int n) {
			  int count = 0;
			  if(n==2) {
				  count = 1;
			  }else if(n==3){
				  
				  count = 2;
			  
			  
			  
			  }else if(n>3) {
				  count = 1;
				  for( int i=4; i<=n; i++) {
					  
					  for( int j=2;j<n;j++) {
						  
						 if(i%j==0) {break;} 
						 
							 count++;
						 
						 }
					  
				  }
			  }
			  
			  
		      int answer = count;
		      return answer;
		  }
		  
		  
		  
		  
		  public static void main(String[] args) {
			  Abc abc = new Abc();
			  
			  Scanner sc = new Scanner(System.in);
			  
			  System.out.println( abc.solution(sc.nextInt()));
		  }
		}


