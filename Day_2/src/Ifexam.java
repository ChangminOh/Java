import java.util.Scanner;

public class Ifexam {
	
	public static void main(String[] args) {

	Scanner sc;
	sc = new Scanner(System.in);
	
	int num = 0; // local variable (지역변수)
	
	System.out.print("num 입력 :");
	num = sc.nextInt();
	
	System.out.print("이름입력 :");
	String name = sc.next();
	
	System.out.println("num ="+num);
	System.out.print("name ="+name);	
}
}