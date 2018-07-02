import java.util.ArrayList;

/**
 * Solution 1 for the problem: 
 * Find the A[i] which value is not paired in A[N]
 * @author Yunjun Wang
 * 
 * correctness 100%, performance 0%, over all score 55%
 *
 */

public class OddOccurenceInteger_1 {
	public int solution(int[] A) {
        // code in Java SE 8
        int N = A.length;
        int n = 0;
        ArrayList<Integer> skipIndx = new ArrayList<Integer>();
        Integer currElm = null;
        Integer unPaired = null;
        
        while(n < N){
        	currElm = A[n];
        	
        	if(!skipIndx.contains(n)){
        		for(int i = n + 1; i < N; i++){
        			if(currElm == A[i] && !skipIndx.contains(i)){
        				skipIndx.add(n);
        				skipIndx.add(i);
        				break;
        			}
        		}
        	}      	
        	n++;
        }
        
        for(int i = 0; i < N; i++){
        	if(!skipIndx.contains(i)){
        		unPaired = i;
        		break;
        	}
        }
        
        return A[unPaired];
	}
}
