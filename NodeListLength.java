/**
 * linked nodes in an integer array A[N]
 * start from A[0], ends where A[i] = -1,
 * where -1 < A[K] < N then K is a valid index
 * 
 * @author Yunjun Wang
 *
 */
public class NodeListLength {
	public int solution(int[] A) {
        // write your code in Java SE 8
		int N = A.length;
        int count = 0;
        
        if(A[0] <= -1 || A[0] == 0){
        	count = 0;
        }else if(A[0] > 0 && A[0] < N){
        	
        	int currIndx = 1;
        	for(int i = 1; i < N; i++){
        		if(A[currIndx] > 0 && A[currIndx] < N){        			
        			count++;
        			if(A[currIndx] != currIndx){
        				currIndx = A[currIndx];
        			}else{break;}
        		}else if(A[currIndx] == -1){
        			count++;
        			break;
        		}else{
        			break;
        		}
        	}
        }
        
        return count;       
        
    }
}
