/*
 *  final
 *  1. field  : 상수화, 이름을 전부 대문자로 표현, 값을 바꿀 수 x [읽기만 가능]
 *              선언과 동시에 초기화!
 *              
 *  2. class  : 상속금지, Has ~ A 관계
 *  
 *  	has ~ a    : 객체가 객체를 가지고 있다.
 *  	Data class : 항상 독립적으로 만든다.
 *  	Data Management class : 독립적으로 존재할 수 없다.
 *  
 *  3. method : 오버라이딩을 금지 
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
