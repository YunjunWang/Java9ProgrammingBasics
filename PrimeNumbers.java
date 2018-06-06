import java.util.ArrayList;
import java.util.List;

/**
 * @author Yunjun Wang
 *
 */
public class PrimeNumbers {

	/**
	 * find all the prime numbers between 2 and 100
	 * @param args
	 */
	public static void main(String[] args) {
		int iNum = 2;
		int i = 0;		
		List<Integer> primes = new ArrayList<>();
		
		while(iNum <= 100) {
			boolean isPrime = true;
			for (i = 0; i < primes.size(); i++) {
				var currNum = primes.get(i);
				if (currNum != iNum && (iNum % currNum) == 0) {
					isPrime = false;
				}
			}
			
			if (isPrime) {
				primes.add(iNum);
			}
			iNum++;
		}
		
		System.out.println("Print all the prime numbers between 2 and 100: ");
		for (i = 0; i < primes.size(); i++) {
			System.out.print(primes.get(i) + "\t");
		}

	}

}
