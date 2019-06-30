public class Fibonacci {

	public int solution(int n) {

		int answer = 0;
		long num1 = 0;							// F(0) 의 값
		long num2 = 1;							// F(1) 의 값
		long num3 = 0;							// F(n) = F(n-1) + F(n-2)  !! F(n) 의 값
		
		for (int i = 2; i <= n; i++) {
			num3 = (num1 + num2) % 1234567;		
			num1 = num2;
			num2 = num3;
		}
		answer = (int) num3;

		return answer;
	}
}



