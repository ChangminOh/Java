import java.util.Scanner;

public class Grd {

	String name;
	int[] score;
	float avg;    // field 생성
	
	void setName(String name) {
		this.name = name;
	}
	void setScore(int[] score) {
		this.score = score;
	}
	void setAvg(float avg) {
		this.avg = avg;
	}
	
	void input() { // input method 생성
		
	 Scanner sc;
	 sc = new Scanner(System.in);
	 
	 System.out.print("이름을 입력하세요.");
	 this.name = sc.next();
	 
	 score = new int[4];
	 
	 score[3]=0;
	 System.out.print("국어,영어,수학 성적을 순서대로 입력하세요.");
	 for(int i=0;i<score.length-1;i++) {
	 	score[i] = sc.nextInt();
	 	score[3] += score[i];
	 	
	 }
	 avg = (float) score[3]/3;
	}

	 void printer() {
		 System.out.print("이름 :"+ name+"\t");
		 System.out.print("국어 :"+score[0]+"\t");
		 System.out.print("수학 :"+score[1]+"\t");
		 System.out.print("영어 :"+score[2]+"\t");
		 System.out.print("총점 :"+score[3]+"\t");
		 System.out.print("평균 :"+avg+"\n");
		 
	 }
	 
	
	}
	
	
	
	
	
	
	



