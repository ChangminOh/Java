import java.util.Scanner;

public class Mg {
	
	Grd[] grd;
	
	Mg(int count){//생성자는 클래스 이름과 같음
		grd = new Grd[count]; // grd의 배열의 메모리 공간만 잡음
		loading();
	}
	void loading() {
		for(int i=0;i<grd.length;i++) {
			grd[i] = new Grd(); // grd의 객체를  count 값 만큼 생성
			grd[i].input();
			}
		for(int i=0;i<grd.length;i++) {// grd의 이름 값 만큼 배열 값을 돌려준다.
			//System.out.print(grd[i].name);
			
			//for(int j=0;j<grd[i].score.length;j++) {
			//System.out.print(grd[i].score[j]+" "+grd[i].avg);
				grd[i].printer();
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("몇명 필요하노");
		int count = sc.nextInt();
		
		Mg mg = new Mg(count);
		}
	}


