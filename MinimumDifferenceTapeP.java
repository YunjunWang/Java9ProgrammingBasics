
public class MinimumDifferenceTapeP {
	public int solution(int[] A) {
        // code in Java SE 8
		
		int N = A.length;
		
		long mini = 0;
		long sumP_1 = 0;
		long sumP_N = 0;
		long back;
		long forward;

		
		int P = 0;
		
		if(N == 2){
			mini = Math.abs(A[0] - A[1]);
		}else{
			P = (int)(N/2 + 1);
			for(int i = 0; i < P; i++){
				sumP_1 = sumP_1 + A[i];
			}
			
			for(int i = P; i < N; i++){
				sumP_N = sumP_N + A[i];
			}
			
			mini = Math.abs(sumP_1 - sumP_N);
			back = Math.abs(sumP_1 - 2 * A[P - 1] - sumP_N);
			forward = Math.abs(sumP_1 + 2 * A[P] - sumP_N);
			
			int next = -2;
			while(back < mini && (P + next) > -1){
				mini = back;
				back = Math.abs(mini - 2 * A[P + next]);			
				next--;			
			}
			
			next = 1;
			while(forward < mini && (P + next) > N){
				mini = forward;
				forward = Math.abs(mini + 2 * A[P + next]);
				
				next++;
			}
		}
		
						
		return (int)mini;
    }
}
