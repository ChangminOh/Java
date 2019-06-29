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
			}                                      // 각 프로그램의 진행 일자를 기록 !!
			
			index.add(count);                      // INDEX에 그 기록들을 저장 !!
			count=0;
			
		}
			count=1;
			
			
		
		for(int i=1; i<index.size();i++) {			// i-1째 기능과  i번째의 기능과 일정을 비교
			
			
		
			
			
			
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
