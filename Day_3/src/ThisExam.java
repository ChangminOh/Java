/*
 * this,this()
 * 1. this는 자기자신을 접근할 수 있게 해주는 객체 레퍼런스
 * 2. 인스턴스메소드의 첫번째 매개변수로 항상 존재하고 있다.
 *    즉, 만들수는 없고 사용만 가능 [이미 만들어저있음]
 *    
 *   void setA( [A this 가 내장되어있다.] , int aa )
 *   aa.setA( [aa,] 10 ) bb.setB( [bb,] 20 )
 *   
 *   this()
 *   1. 자기자신 생성자에서 또 다른 자기자신 생성자를 호출
 */
public class ThisExam {
//	private int age;
//	//마우스 오른쪽 소스 generate get and set
//	void setAge (int age) { // void setAge(ThisExam this,int a)
//		this.age = age;
//	}
//	int getAge() { // int getAge(ThisExam this)
//		return age;
//	}
//	public void main(String[] args) {
//		ThisExam te = new ThisExam();
//		
//		te.setAge(10); // te.setAge(te,10);
//		System.out.println(te.getAge());// te.getAge(te);
//	}
//
//	public ThisExam getObject() {
//		return this;
//	}
	private int a;
	private int b;
	
	public ThisExam(int a, int b){
		//this.a=a;this.b=b;
	   
	}
	public ThisExam(int a){
		//this.a=a;
		this(a,0);
	}
	public ThisExam(){
		//a=b=0;
		
	}
	void setA(int a,int b) {
		this.a=a;this.b=b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public static void main(String[] args) {
		ThisExam te1 = new ThisExam(); // 0,0
		ThisExam te2 = new ThisExam(10); // 10,0
		ThisExam te3 = new ThisExam(20,30);// 20,30
		
		System.out.println(te1.getA()+"\t"+te1.getB());
		System.out.println(te2.getA()+"\t"+te2.getB());
		System.out.println(te3.getA()+"\t"+te3.getB());
	}
}	