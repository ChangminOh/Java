
public class Day2 {
	
	public static void main(String[] args) {
		
		int count = 0;
		int rect = 1;
		
		for(count=0;rect<500;count++) {
			rect <<=1; 
		}
		System.out.print("Á¢ÀºÈ½¼ö = ");
		System.out.println(count);
		
		System.out.println("»ç°¢Çü°¹¼ö = "+rect);
		
	}

}
