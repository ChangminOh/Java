/*
 * this,this()
 * 1. this�� �ڱ��ڽ��� ������ �� �ְ� ���ִ� ��ü ���۷���
 * 2. �ν��Ͻ��޼ҵ��� ù��° �Ű������� �׻� �����ϰ� �ִ�.
 *    ��, ������� ���� ��븸 ���� [�̹� �����������]
 *    
 *   void setA( [A this �� ����Ǿ��ִ�.] , int aa )
 *   aa.setA( [aa,] 10 ) bb.setB( [bb,] 20 )
 *   
 *   this()
 *   1. �ڱ��ڽ� �����ڿ��� �� �ٸ� �ڱ��ڽ� �����ڸ� ȣ��
 */
public class ThisExam {
//	private int age;
//	//���콺 ������ �ҽ� generate get and set
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