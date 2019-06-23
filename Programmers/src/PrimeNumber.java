import java.util.Scanner;

public class PrimeNumber {

	int count;
	boolean check;

	public int solution(int n) {

		if (n == 2) {
			count = 1;
		} else if (n == 3) {

			count = 2;

		} else if (n >= 4) {
			count = 2;

			for (int i = 4; i <= n; i++) {
				check = true;

				for (int j = 2; j < i; j++) {

					if ( i % j == 0) {

						check = false;
						break;
					}

				}

				if (check) {
					count++;
				}
				
			}
		}

		return count;
	}

	public static void main(String[] args) {
		PrimeNumber abc = new PrimeNumber();

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");

		System.out.println(abc.solution(sc.nextInt()));
	}
}
