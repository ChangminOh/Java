
public class StringExam extends Object{
	
	public static void main(String[] args) {
		
		String str = "Superman";
		String str1 = "Superman";
		
//		String str=new String("Superman");
//		String str1=new String("Superman");
		
		if(str==str1) {   // 위치비교
			System.out.println("Same");
		}else {
			System.out.println("Def");
		}
		if(str.equals(str1)) {   // 데이터비교
			System.out.println("Same");
		}else {
			System.out.println("Def");
		}
		
//		String str = new String("superman");
//		
//		System.out.println(str.toString());
//		System.out.println(str);
//		
////		StringExam se = new StringExam();
////		System.out.println(se.toString());
//	
//	
//	 	str = new String("Batman");
//	 	System.out.println(str);
//	 	
//	 	str="Pororo";// new String("Pororo")
//	 	System.out.println(str);
	 	
	 	
	 	
	}
}