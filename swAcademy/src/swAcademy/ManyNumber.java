package swAcademy;

import java.util.Scanner;

public class ManyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] student = new int[1000];
		int[] index = new int[101];
		int max = 0; // 횟수
		int score = 0; // 점수
		int lscore = 0;

//	for(int i=0; i<student.length;i++) {       //1000개의 성적 생성
//		
//		student[i] = (int) (Math.random()*100) +1 ;
//		
//	}

		for (int i = 0 ; i < T; i++) {

			for (int i1 = 0; i1 < student.length; i1++) {
				student[i1] = sc.nextInt();
			}

			for (int i1 = 0; i1 < student.length; i1++) { // 0점부터 100점까지 점수 카운트

				index[student[i1]]++;
			}

			/*
			 * for(int i=1; i<index.length;i++) { // 각 점수에 대한 점수 카운트
			 * System.out.println("#"+(i)+" "+index[i]); }
			 */

			for (int i1 = 1; i1 < index.length; i1++) {

				if (max <= index[i1]) { // 최빈값을 출력하기 위해서 횟수 측정

					max = index[i1]; // 최빈값의 횟수
					score = i1; // 최빈값
				}
			}

			System.out.println("#" + (i + 1) + " " + score);

		}
	}
}
