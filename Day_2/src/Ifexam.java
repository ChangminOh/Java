import java.util.Scanner;

public class Ifexam {
	
	public static void main(String[] args) {

	Scanner sc;
	sc = new Scanner(System.in);
	
	int num = 0; // local variable (��������)
	
	System.out.print("num �Է� :");
	num = sc.nextInt();
	
	System.out.print("�̸��Է� :");
	String name = sc.next();
	
	System.out.println("num ="+num);
	System.out.print("name ="+name);	
}
}