/**
 * Solution 2 for this problem:
 * Find the A[i] which value is not paired in A[N]
 * @author Yunjun Wang
 * correctness 60%, performance 25%, over all score 44%
 */


public class OddOccurenceInteger_2 {
	public int solution(int[] A) {
        // code in Java SE 8
        int N = A.length;
        int currIndx = 0;
        int skipIndx = -1;
        int preSkipIndx = -1;
        int startIndx = -1;
        int endIndx = N - 1;
        int currElm = A[0];
        Integer unPaired = 0;
        
        if(N == 1){
        	unPaired = A[0];
        }
        
        while(currIndx < endIndx){
        	currElm = A[currIndx];
        	startIndx = currIndx + 1;
        	
        	if(startIndx == skipIndx && startIndx != preSkipIndx){
        		if(startIndx == endIndx){
        			unPaired = currElm;
        			break;
        		}
        		startIndx++;
        	}
        	
        	if(startIndx == endIndx && currIndx == skipIndx){
    			unPaired = A[startIndx];
    			break;
    		}

        	if(currIndx != skipIndx && currIndx != preSkipIndx){
        		int newSkip = findElm(currElm, startIndx, endIndx, skipIndx, A);
            	if(newSkip > 0 ){
            		preSkipIndx = skipIndx;
            		skipIndx = newSkip;
            	}else{
            		unPaired = currElm;
            		break;
            	}
        	}
        	
        		currIndx++;       		
        }
		
		return unPaired;
    }
	
	public int findElm(int currElm, int startIndx, int endIndx, int skipIndx, int[] A){
		int newSkip = -1;
		for(int i = startIndx; i <= endIndx; i++){
			if(currElm == A[i]){
				newSkip = i;
				break;
			}			
		} 		
		return newSkip;
	}
}
