/**
* finding the minum jumps
* by given start position X, target position Y
* and each jump D
*/

public class FrogMinJumps {
	public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		int jumps = 0;
		
		if(X < Y){
			jumps = (Y - X) / D;
			float mod = (Y - X) % D;
			
			jumps = (mod > 0) ? (jumps + 1) : jumps;
		}		
		return jumps;
    }
}
