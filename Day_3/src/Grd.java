import java.util.Scanner;

public class Grd {

	String name;
	int[] score;
	float avg;    // field ����
	
	void setName(String name) {
		this.name = name;
	}
	void setScore(int[] score) {
		this.score = score;
	}
	void setAvg(float avg) {
		this.avg = avg;
	}
	
	void input() { // input method ����
		
	 Scanner sc;
	 sc = new Scanner(System.in);
	 
	 System.out.print("�̸��� �Է��ϼ���.");
	 this.name = sc.next();
	 
	 score = new int[4];
	 
	 score[3]=0;
	 System.out.print("����,����,���� ������ ������� �Է��ϼ���.");
	 for(int i=0;i<score.length-1;i++) {
	 	score[i] = sc.nextInt();
	 	score[3] += score[i];
	 	
	 }
	 avg = (float) score[3]/3;
	}

	 void printer() {
		 System.out.print("�̸� :"+ name+"\t");
		 System.out.print("���� :"+score[0]+"\t");
		 System.out.print("���� :"+score[1]+"\t");
		 System.out.print("���� :"+score[2]+"\t");
		 System.out.print("���� :"+score[3]+"\t");
		 System.out.print("��� :"+avg+"\n");
		 
	 }
	 
	
	}
	
	
	
	
	
	
	



