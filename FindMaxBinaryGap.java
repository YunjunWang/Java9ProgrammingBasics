/**
*finding max binary gap in a given number
*@author Yunjun Wang
*/
public class FindMaxBinaryGap {

	public int findMaxBinaryGap(int N){
		
		String bString = Integer.toBinaryString(N);
		char[] c = bString.toCharArray();
		int gap = 0;
		int maxGap = 0;
		
		for(int i = 0; i < c.length; i++){
			if(c[i] == '0'){
				gap++;
			}else{
				maxGap = (maxGap >= gap) ? maxGap : gap;
				gap = 0;
			}
		}
		
		return maxGap;
	}
}
