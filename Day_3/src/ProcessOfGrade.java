import java.util.Scanner;

public class ProcessOfGrade {
 
 private String name;
 private int[] score;
 private float avg;   //field ����

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
 
 System.out.print("�̸��� �Է��ϼ���.");
 String name = sc.next();
 pog.setName(name);
 System.out.println("����,����,���� ������ ������� �Է��ϼ���.");
 for(int i=0;i<score.length;i++) {
  score[i] = sc.nextInt();
  //pog.setScore(score[i]) ;
  
 }
 pog.setScore(score);
 
 System.out.println("�̸� :"+pog.getName());//
 
 sub = pog.getScore();
 for(int i=0;i<score.length;i++) {
  
  sum += sub[i];
 }
 pog.setAvg(sum/3);
 System.out.println("���� :"+sum);
 System.out.println("��� :"+pog.getAvg());
 }
} 
	
