
public class Homework4 {

	public static void main(String[] args) {
		int i;
		int j;
		int k;
		int h = 3;
		for (i = 3; i > 0; i--) {

			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (k = 3; k <= h; k++) {
				System.out.print("*");
			}
			System.out.println();
			h += 2;
		}
	}
}
