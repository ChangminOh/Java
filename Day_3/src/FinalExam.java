/*
 *  final
 *  1. field  : ���ȭ, �̸��� ���� �빮�ڷ� ǥ��, ���� �ٲ� �� x [�б⸸ ����]
 *              ����� ���ÿ� �ʱ�ȭ!
 *              
 *  2. class  : ��ӱ���, Has ~ A ����
 *  
 *  	has ~ a    : ��ü�� ��ü�� ������ �ִ�.
 *  	Data class : �׻� ���������� �����.
 *  	Data Management class : ���������� ������ �� ����.
 *  
 *  3. method : �������̵��� ���� 
 *  
 *  
 */

public class FinalExam {
	
	private A data; // has ~ a
	private String name;
	
	public FinalExam(String name,int data) {
		this.data = new A(data) ;
		System.out.println("B");
		this.name=name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setA(int a) {
		data.setA(a);
	}
	public int getA() {
		return data.getA();
	}
	
	
	
	public static void main(String[] args) {
		
		FinalExam fe = new FinalExam("superman",10);
		
		//fe.setA(10);
		System.out.println(fe.getA());
		System.err.println(fe.getName());
	}
}
