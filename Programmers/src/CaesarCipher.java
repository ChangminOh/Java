import java.util.Scanner;

public class CaesarCipher {
	
	 public String solution(String s, int n) {
		 
		 char []arr = s.toCharArray(); // �ϳ��ϳ� ���ڸ� �ޱ� ���ؼ� �迭�� ����
		 
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
	        System.out.println("���ڿ� �̴� ���� ��������.");
	        System.out.println(cc.solution(sc.nextLine(), sc.nextInt())); 
	        
	    }
	}


