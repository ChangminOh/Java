
public class Stealman {

	class Solution {
	    int count;

	    Solution(){
	        count = 0;
	    }
	    public int solution(int n, int[] lost, int[] reserve) {
	    	
	    	for( int i=0; i<lost.length;i++){
	            for(int j=0; j<reserve.length;j++){
	            	 if(lost[i]==reserve[j]-1){
		                    lost[i]=-1; reserve[j]=-1;
	            }
	            }
	    	}

	        for( int i=0; i<lost.length;i++){
	            for(int j=0; j<reserve.length;j++){

	                if(lost[i]==reserve[j]-1){
	                    lost[i]=-1; reserve[j]=-1; break;
	                }else if(lost[i]==reserve[j]){
	                    lost[i]=-1; reserve[j]=-1;break;
	                }else if(lost[i]==reserve[j]+1){
	                    lost[i]=-1; reserve[j]=-1; break;
	                }
	            }
	        }

	        for(int i=0; i<lost.length;i++){
	            if(lost[i]!=-1){
	                ++count;
	            }
	        }

	        int answer = n-count;
	        return answer;
	    }
	}

}
