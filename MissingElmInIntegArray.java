/**
* find the missing element(> 0) in an integer array A[N]
* where the value of the element is not in the index of the A
* (-1 < A[i] < (N + 1))
* @author Yunjun Wang
*/

public class MissingElmInIntegArray {
	public int solution(int[] A) {
    		// code in Java SE 8
    		// currently only consider A[i] >= 0
		int missElm = 0;
		long N = A.length;
		long sumArr = 0;
		long sum = N * (N + 3 ) / 2 + 1;
		
		for(int i = 0; i < N; i++){
			sumArr = sumArr + A[i];
		}
		
		missElm = (int)(sum - sumArr);
		
		return missElm;
    }
}
