import java.util.*;
import java.lang.*;

public class ProgrammerTest1 {

	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		int b = x;
		for (int i = 0; i < answer.length; i++) {

			answer[i] = x;

			x = x + b;

		}

		return answer;
	}

	public int[] solution(int[] array, int[][] commands) {

		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] copy = null;
			copy = Arrays.copyOf(array, array.length);

			Arrays.parallelSort(copy, commands[i][0] - 1, commands[i][1]);
			answer[i] = copy[commands[i][0] + commands[i][2] - 2];

		}

		return answer;
	}

	public int[] solution(int[] aa) {
		
		// 수포자의 정답 패턴을 배열에 담은 것
		int[] gu1 = { 1, 2, 3, 4, 5 };
		int[] gu2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] gu3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		// 각 수포자들의 정답을 카운트 하기 위한 배열
		int count[] = new int[3];
		
		// 가장 높은 점수를 저장
		int maximum = 0;

	
		List<Integer>arr = new ArrayList<Integer>();

		for (int i = 0; i < aa.length; i++) {

			if (aa[i] == gu1[i % 5]) {
				count[0]++;

			}
			if (aa[i] == gu2[i % 8]) {
				count[1]++;

			}
			if (aa[i] == gu3[i % 10]) {
				count[2]++;
			}

		}
		
		// 가장 큰 점수를 일단 첫 수포자로 잡음
		maximum = count[0];
		
		for (int i=0; i<count.length;i++) {
			if (maximum < count[i]) {
				maximum=count[i];
			}
		}
		
		for (int i=0; i<3; i++) {
			if (maximum == count[i]) {
				arr.add(i+1);
			}
		}
		
		int []answer = new int[arr.size()];
		for (int i=0; i<arr.size();i++) {
			answer[i] = arr.get(i);
		}
		
		
			
		return answer;
	}

//	int s;
//	int e;
//	int k;
//	int[] test;
//    public int[] solution(int[] array, int[][] commands) {
//		test = null;
//		int[] answer = new int[commands.length];
//		for (int i = 0; i < commands.length; i++) {
//			test = Arrays.copyOf(array, array.length);
//			for (int j = 0; j < 3; j++) {
//				switch (j) {
//
//				case 0:
//					s = commands[i][j];
//					break;
//				case 1:
//					e = commands[i][j];
//					break;
//				case 2:
//					k = commands[i][j];
//				}
//
//			}
//
//			Arrays.parallelSort(test, s-1, e);
//
//			answer[i] = test[s+k-2];
//
//		}
//
//		return answer;
//	}

}
