package Day1;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("�ν��Ͻ��� �����߽��ϴ�.");
	}
	public static Singleton getInstance() {
		return singleton;
	}

	
}
