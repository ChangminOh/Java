import java.util.Arrays;

public class Atk{
	int s;
	int e;
	int k;
	int[] test;

	public int[] solution(int[] array, int[][] commands) {
		test = null;
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			test = Arrays.copyOf(array, array.length);
			for (int j = 0; j < 3; j++) {
				switch (j) {

				case 0:
					s = commands[i][j];
					break;
				case 1:
					e = commands[i][j];
					break;
				case 2:
					k = commands[i][j];
				}

			}

			Arrays.parallelSort(test, s-1, e-1);

			answer[i] = test[s+k-2];

		}

		return answer;
	}

	
}