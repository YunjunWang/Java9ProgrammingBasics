/**
 * Rotate an integer array A[N] K times
 * @author Yunjun Wang
 * correctness 100%
 */
public class RotateArrayRightKTimes {

	public int[] rotateRightKTimes(int[] A, int K){
		
		int length = A.length;
		int B[] = new int[length];
		
		while(K > 0 && length > 0){
        	
        	B[0] = A[length - 1];
        	for(int i = 1; i < length; i++){
                B[i] = A[i - 1];
            }
        	
            for(int j = 0; j < length; j++){
            	A[j] = B[j];
            }
            
            K--;
        }
		
        return A;
	}
}
