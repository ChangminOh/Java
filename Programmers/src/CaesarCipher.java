import java.util.Scanner;

public class CaesarCipher {
	
	 public String solution(String s, int n) {
		 
		 char []arr = s.toCharArray(); // 하나하나 문자를 받기 위해서 배열을 생성
		 
		 	for(int i=0; i<arr.length; i++) {
		 		
		 		if(arr[i]<97 && arr[i]>=65) {
		 			
		 			if( (arr[i] + n)>90) {
		 				arr[i] = (char) ((arr[i] + n) - 26);
		 			}else { arr[i] = (char) (arr[i] + n);}
		 			
		 		}else if( arr[i]>=97) {
		 			
		 			if( (arr[i] + n)  > 122){
		 				arr[i] = (char) ((arr[i]+n) - 26);
		 			} else{arr[i] = (char) (arr[i] + n);}
		 			
		 		}else if(arr[i] == 32) {
		 			arr[i] = 32;
		 			
		 		}
		 	}
		 		String answer = String.valueOf(arr);
		 
	      return answer;
	      
	  }
	    public static void main(String[] args){
	    	CaesarCipher cc= new CaesarCipher();
	    	
	        Scanner sc = new Scanner(System.in);
	        System.out.println("문자와 미는 수를 적으세요.");
	        System.out.println(cc.solution(sc.nextLine(), sc.nextInt())); 
	        
	    }
	}


