
public class Minimum {

	public int solution(int []A, int []B){
		 int C=0;
		 int F=0;
		 int answer = 0;
		 boolean tf=true;
		 boolean ft=true;
		 
		 
		 while( tf || ft ) {
		 
		 for(int i=1;i<A.length;i++) { // A 를 오름차순으로 정렬
			 if(A[i-1]>A[i]) {
				 C = A[i-1];
				 A[i-1] = A[i];
				 A[i] = C;	 
			 }
			 if(B[i-1]<B[i]) {			//B 오름차순 정렬
				 F = B[i-1];
				 B[i-1] = B[i];
				 B[i] = F;	 
			 }
		 }
		 
		
		 
		 for(int i=1;i<A.length;i++) { // A 를 오름차순으로 정렬
			 if(A[i-1]>A[i]) {
				tf = true; break;
			 }else {tf=false;}
		 }
		 
		 for(int i=1;i<B.length;i++) { // B를 오름차순으로 정렬
			 if(B[i-1]<B[i]) {
				 ft=true;  break;
			 }else {ft=false;}
		 }
		 
		 } // while 문이 조건에 맞게 실행
		 
		 for(int i=0; i<A.length;i++) {
			answer += A[i] * B[i];
		 }
		 
		 
		 
		 
		 
	        

	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("Hello Java");

	        return answer;
	    }

}
