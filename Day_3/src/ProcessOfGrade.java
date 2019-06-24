import java.util.Scanner;

public class ProcessOfGrade {
 
 private String name;
 private int[] score;
 private float avg;   //field 생성

 public void setName(String name) {
 this.name = name;
 }
 public void setScore(int[] score) {
  this.score = score;
 }
 public void setAvg(float avg) {
  this.avg = avg;
 }
 
 public String getName() {
  return name;
 }
 public int[] getScore() {
  return score;
 }
 public float getAvg() {
  return avg;
 }
 
 {
 int []score;int []sub;
 sub = new int[3];score = new int[3];
 int sum=0;
 ProcessOfGrade pog = new ProcessOfGrade();
 
 Scanner sc;
 sc = new Scanner(System.in);
 
 System.out.print("이름을 입력하세요.");
 String name = sc.next();
 pog.setName(name);
 System.out.println("국어,영어,수학 점수를 순서대로 입력하세요.");
 for(int i=0;i<score.length;i++) {
  score[i] = sc.nextInt();
  //pog.setScore(score[i]) ;
  
 }
 pog.setScore(score);
 
 System.out.println("이름 :"+pog.getName());//
 
 sub = pog.getScore();
 for(int i=0;i<score.length;i++) {
  
  sum += sub[i];
 }
 pog.setAvg(sum/3);
 System.out.println("총점 :"+sum);
 System.out.println("평균 :"+pog.getAvg());
 }
} 
	
