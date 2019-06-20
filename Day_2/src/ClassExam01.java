/*
 * field(�������)
 * : ��ü������ ����ؼ� ���Ǿ����� ���� 
 * : �ַ� private���� ����
 * : �ܺ� ��ü���� ���������� ���� �Ҽ� ���� ó��
 * : �޼ҵ带 ���� ����Ҽ� �ְ� ���� 
 *  
 * constuctor(�������Լ�)
 * : ��ü ������ �ڵ�ȣ��Ǿ����� �޼ҵ� 
 * : ����Ÿ���� ����. 
 * : �޼ҵ���� Ŭ������� �����ϴ�. 
 * : �������Լ��� ��������� �������� ������� ����Ʈ�������Լ��� �����Ѵ�. 
 * : ����Ʈ��Ȱ : ��ü��� 
 * : ����ڿ�Ȱ : ��ü������ �ʵ� �ʱ�ȭ 
 * : Overroding ���� 
 * 
 * 
 * method(�Լ�)
 * : �ܺο� ���θ� ���� 
 * : instance method :  ��ü �����Ŀ� ���Ǵ� �޼ҵ�
 * : static method : ��ü �����ϰ� ���Ǵ� �޼ҵ� 
 * : �����ε��� ���� 
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
  ClassExam01 cex = new ClassExam01("superman",1000); // ��ü���� 
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
