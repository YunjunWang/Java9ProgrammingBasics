import java.util.ArrayList;

/**
 * Solution 3 for the problem:
 * Find the A[i] which value is not paired in A[N]
 * @author Yunjun Wang
 * 
 * correctness 80%, performance 0%, over all score 44%
 */
public class OddOccurenceInteger_3 {
	public int solution(int[] A) {
        // code in Java SE 8
        int N = A.length;
        int n = 0;
        ArrayList<Integer> skips = new ArrayList<Integer>();
        Integer currElm = null;
        Integer unPaired = null;
        
        if(n == (N - 1)){//only 1 element
        	unPaired = A[n];
        }else{
        	while(n < N){//2 ore more elements
            	currElm = A[n];
            	
            	if(!skips.contains(A[n])){
            		for(int i = n + 1; i < N; i++){
            			if(currElm == A[i] && !skips.contains(A[i])){
            				skips.add(A[n]);
            				break;
            			}
            		}
            	}      	
            	n++;
            }
            
            for(int i = 0; i < N; i++){
            	if(!skips.contains(A[i])){
            		unPaired = A[i];
            		break;
            	}
            }
        }        
        return unPaired;
	}
}
