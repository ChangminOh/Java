
public class For2 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;

		for (i = 1; i < 10; i++) {
			System.out.print("\n");
			for (j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");

			}
		}
	}

}
