package swAcademy;

import java.util.Scanner;

public class ManyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] student = new int[1000];
		int[] index = new int[101];
		int max = 0; // Ƚ��
		int score = 0; // ����
		int lscore = 0;

//	for(int i=0; i<student.length;i++) {       //1000���� ���� ����
//		
//		student[i] = (int) (Math.random()*100) +1 ;
//		
//	}

		for (int i = 0 ; i < T; i++) {

			for (int i1 = 0; i1 < student.length; i1++) {
				student[i1] = sc.nextInt();
			}

			for (int i1 = 0; i1 < student.length; i1++) { // 0������ 100������ ���� ī��Ʈ

				index[student[i1]]++;
			}

			/*
			 * for(int i=1; i<index.length;i++) { // �� ������ ���� ���� ī��Ʈ
			 * System.out.println("#"+(i)+" "+index[i]); }
			 */

			for (int i1 = 1; i1 < index.length; i1++) {

				if (max <= index[i1]) { // �ֺ��� ����ϱ� ���ؼ� Ƚ�� ����

					max = index[i1]; // �ֺ��� Ƚ��
					score = i1; // �ֺ�
				}
			}

			System.out.println("#" + (i + 1) + " " + score);

		}
	}
}
