
public class HarshadNumber {

	
	
		  public boolean solution(int x) {
			  int z = x;
			  int y=0;
			 boolean answer = false;
			  while(true) {
				  y += z%10;
				  z = z/10;
				  
				  
				  if (z==0) {break;}
			  }
			  
			  if(x%y==0) {
			  answer = true;
			  }
		      return answer;
		  }
		
}
