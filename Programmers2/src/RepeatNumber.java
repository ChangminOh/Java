
public class RepeatNumber {
	
	  public long[] solution(int x, int n) {
		  
		  long[] answer = new long[n];
		  
		  for(int i=0; i<answer.length;i++) {
			  
			  if(i==0) {answer[i] =x;}
		  else { 
			  
			  answer[i] = answer[i-1]+x;
			  }
				  
		  }
	  
	      
		  
	      
	      return answer;
	  }

}
