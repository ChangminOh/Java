import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDevelopment {
	int[] answer;
	
	int[] sol;
	public int[] solution(int[] progresses, int[] speeds) {
		int count=0;
		int n = 0;
		
		ArrayList<Integer> answer = new ArrayList<>();
		ArrayList<Integer> index = new ArrayList<>();
		
		for(int i=0; i<progresses.length;i++) {
			
			while(progresses[i]<=100) {
				progresses[i] += speeds[i];
				count++;
			}                                      // �� ���α׷��� ���� ���ڸ� ��� !!
			
			index.add(count);                      // INDEX�� �� ��ϵ��� ���� !!
			count=0;
			
		}
			count=1;
			
			
		
		for(int i=1; i<index.size();i++) {			// i-1° ��ɰ�  i��°�� ��ɰ� ������ ��
			
			
		
			
			
			
			if( index.get(n) >= index.get(i)) {
				
				count++;
			}else if(index.get(n) < index.get(i)) {
				answer.add(count);
				count=1;
				n=i;
			}
			
			if(i == index.size()-1) {
				answer.add(count);
			}
			
		}
		
		sol = new int[answer.size()];
		
		for(int i=0; i<sol.length;i++) {
			sol[i] = answer.get(i);
		}
		
        return sol;
    }

}
