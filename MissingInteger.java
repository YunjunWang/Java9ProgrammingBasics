/**
 * find the smallest positive integer in an integer array A[N]
 * is missing
 * @author Yunjun Wang
 *
 */
public class MissingInteger {
	public int missingInteger(int[] A) {
		// missing integer		
		int val = 1;
		boolean isFound = false;
		while(val < A.length){
			for(int i = 0; i < A.length; i++){
				if(val == A[i]){
					isFound = true;
					break;
				}else{
					isFound = false;
				}
			}
			if(isFound){
				val++;
			}else{
				break;
			}
		}	
		return val;		       
	}
}
