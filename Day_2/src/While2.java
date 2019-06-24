
public class While2 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		
		i=1;
		while(i<10) {
			j=2;
			System.out.println();
			while(j<10) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				j+=1;
			}
			i+=1;
		}
	}

}
