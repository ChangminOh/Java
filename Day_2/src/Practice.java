
public class Practice {
	//field 持失
	private String name;
	private int age;
	//method 持失
	public void setName(String n) {
		name=n;
	}
	public void setAge(int a) {
		age=a;
	}
	//getter 持失
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		Practice pr = new Practice();
		pr.setName("ultraman");
		System.out.println(pr.getName()); 
		pr.setAge(44);
		System.out.println(pr.getAge());
	}
	
}
