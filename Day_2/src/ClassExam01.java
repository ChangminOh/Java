/*
 * field(멤버변수)
 * : 객체생성시 계속해서 사용되어지는 변수 
 * : 주로 private으로 지정
 * : 외부 객체에서 직접적으로 접근 할수 없게 처리
 * : 메소드를 통해 사용할수 있게 제공 
 *  
 * constuctor(생성자함수)
 * : 객체 생성시 자동호출되어지는 메소드 
 * : 리턴타입이 없다. 
 * : 메소드명이 클래스명과 동일하다. 
 * : 생성자함수를 명시적으로 제공하지 않을경우 디폴트생성자함수를 제공한다. 
 * : 디폴트역활 : 객체등록 
 * : 사용자역활 : 객체생성시 필드 초기화 
 * : Overroding 가능 
 * 
 * 
 * method(함수)
 * : 외부와 내부를 연결 
 * : instance method :  객체 생성후에 사용되는 메소드
 * : static method : 객체 무관하게 사용되는 메소드 
 * : 오버로딩이 가능 
 */
public class ClassExam01 {

 //field
 private String name;
 private int age; 
 
 ClassExam01(String s,int n){
  name = s;
  age = n; 
 } // default constructor method 
 
 
 //method 
 public void setName(String n){ name = n; }
 public void setAge(int a){ age = a; }
 
 //getter
 public String getName(){return name;}
 public int getAge(){ return age; }
 
 
 public static void main(String[] args) {
  ClassExam01 cex = new ClassExam01("superman",1000); // 객체생성 
//  cex.setName("Superman");
//  cex.setAge(1000);
  
  cex.name = "superwoman";
  
  System.out.println(cex.getName());
  System.out.println(cex.getAge());
  
  ClassExam01 cex1 = new ClassExam01("batman",40); 
  System.out.println(cex1.getName());
  System.out.println(cex1.getAge());
 }
}
