
public class Minimum {

	public int solution(int []A, int []B){
		 int C=0;
		 int F=0;
		 int answer = 0;
		 boolean tf=true;
		 boolean ft=true;
		 
		 
		 while( tf || ft ) {
		 
		 for(int i=1;i<A.length;i++) { // A �� ������������ ����
			 if(A[i-1]>A[i]) {
				 C = A[i-1];
				 A[i-1] = A[i];
				 A[i] = C;	 
			 }
			 if(B[i-1]<B[i]) {			//B �������� ����
				 F = B[i-1];
				 B[i-1] = B[i];
				 B[i] = F;	 
			 }
		 }
		 
		
		 
		 for(int i=1;i<A.length;i++) { // A �� ������������ ����
			 if(A[i-1]>A[i]) {
				tf = true; break;
			 }else {tf=false;}
		 }
		 
		 for(int i=1;i<B.length;i++) { // B�� ������������ ����
			 if(B[i-1]<B[i]) {
				 ft=true;  break;
			 }else {ft=false;}
		 }
		 
		 } // while ���� ���ǿ� �°� ����
		 
		 for(int i=0; i<A.length;i++) {
			answer += A[i] * B[i];
		 }
		 
		 
		 
		 
		 
	        

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("Hello Java");

	        return answer;
	    }

}
