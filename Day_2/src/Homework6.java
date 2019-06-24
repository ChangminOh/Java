import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args) {
		int stack;
		Scanner sc ;
		sc = new Scanner(System.in);
		
		System.out.println("홀수층을 입력하세요.");
		
		stack = sc.nextInt();
		
		if(stack%2==(1)) {
		
		for(int i= (int) Math.floor(stack/2)*-1; i<=(int) Math.floor(stack/2);i++) {
			
			for(int j=(int) Math.floor(stack/2)*-1;j<=(int) Math.floor(stack/2);j++) {
				
				if(Math.abs(i)+Math.abs(j)<=(int) Math.floor(stack/2)) {
					
				System.out.print("*");
				
			}
			else {System.out.print(" ");}
				
			
		}System.out.println();
		}
		
	}
		else{
			System.out.print("홀수만 입력하세요.");
		}
		}}

