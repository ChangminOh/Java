import java.util.Scanner;

public class Mg {
	
	Grd[] grd;
	
	Mg(int count){//�����ڴ� Ŭ���� �̸��� ����
		grd = new Grd[count]; // grd�� �迭�� �޸� ������ ����
		loading();
	}
	void loading() {
		for(int i=0;i<grd.length;i++) {
			grd[i] = new Grd(); // grd�� ��ü��  count �� ��ŭ ����
			grd[i].input();
			}
		for(int i=0;i<grd.length;i++) {// grd�� �̸� �� ��ŭ �迭 ���� �����ش�.
			//System.out.print(grd[i].name);
			
			//for(int j=0;j<grd[i].score.length;j++) {
			//System.out.print(grd[i].score[j]+" "+grd[i].avg);
				grd[i].printer();
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("��� �ʿ��ϳ�");
		int count = sc.nextInt();
		
		Mg mg = new Mg(count);
		}
	}


