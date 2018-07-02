/**
 * Tests
 * @author Yunjun Wang
 *
 */
public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] missingInteA = {1, 3, 6, 4, 1, 2};
		MissingInteger missingInte = new MissingInteger();
		int val = missingInte.missingInteger(missingInteA);

		System.out.println("missing integer is: " + val);
		System.out.println();
		

		FindMaxBinaryGap gap = new FindMaxBinaryGap();
		int maxGap = gap.findMaxBinaryGap(1041);
		System.out.println("maxGap is: " + maxGap);
		System.out.println();
		
		
		
		int A[] = {3, 8, 9, 7, 6};		
		RotateArrayRightKTimes rotateKTimes = new RotateArrayRightKTimes();
		int[] rotatedA = rotateKTimes.rotateRightKTimes(A, 3);
		System.out.println("after rotated: ");
        for(int i = 0; i < rotatedA.length; i++){
        	System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.println();
		
		
		
		//OddOccurrencesInArray
		//find unpaired element in an non-empty odd numbered integer array
		int[] unPairedA = {9, 3, 9, 3, 9, 7, 9,
				1, 1, 2, 2, 4, 4, 
				5, 5, 6, 6, 8, 8,
				11, 11, 11, 11, 11, 11,
				12, 13, 14, 12, 13, 14,
				15, 16, 17, 15, 16, 17,
				18, 19, 20, 18, 19, 20
		};//N = 43

		int[] unPairedB = {9, 3, 9, 3, 9, 7, 9};//N = 7
		
		int[] unPairedC = {3, 3, 9, 4, 9};//N = 5
		int[] unPairedD = {3};//N = 1
		int[] unPairedE = {3, 3, 3, 3, 4};//N = 5
		int[] unPairedF = {1, 2, 3, 1, 2, 3, 1, 2, 1, 2, 4};//N = 11
		
		int unPaired = -1;
		OddOccurenceInteger_1 oddC_1 = new OddOccurenceInteger_1();
		unPaired= oddC_1.solution(unPairedA);
		System.out.println("unPaired: " + unPaired + ", expected 7");

		unPaired = oddC_1.solution(unPairedB);
		System.out.println("unPaired: " + unPaired + ", expected 7");
		
		unPaired = oddC_1.solution(unPairedC);
		System.out.println("unPaired: " + unPaired + ", expected 4");
		
		unPaired = oddC_1.solution(unPairedD);
		System.out.println("unPaired: " + unPaired + ", expected 3");
		System.out.println();

		OddOccurenceInteger_3 oddC = new OddOccurenceInteger_3();

		unPaired = -1;
		unPaired= oddC.solution(unPairedA);
		System.out.println("unPaired: " + unPaired + ", expected 7");

		unPaired = oddC.solution(unPairedB);
		System.out.println("unPaired: " + unPaired + ", expected 7");
		
		unPaired = oddC.solution(unPairedC);
		System.out.println("unPaired: " + unPaired + ", expected 4");
		
		unPaired = oddC.solution(unPairedD);
		System.out.println("unPaired: " + unPaired + ", expected 3");
		
		unPaired = oddC.solution(unPairedE);
		System.out.println("unPaired: " + unPaired + ", expected 4");
		
		unPaired = oddC.solution(unPairedF);
		System.out.println("unPaired: " + unPaired + ", expected 4");
		System.out.println();
		
		
		int steps = 0;
		FrogMinJumps jumps = new FrogMinJumps();
		steps = jumps.solution(10, 85, 30);
		System.out.println("steps is: " + steps);
		System.out.println();
		
		
		int[] missElmArr = {1, 3, 2, 5};
		int[] missElmArr2 = {1};
		int[] missElmArr3 = {2};
		int[] missElmArr4 = {1, 3};
		int[] missElmArr5 = {2, 3};
		int[] missElmArr6 = {7, 3, 4, 5, 6, 2};
		int[] missElmArr7 = {7, 3, 4, 5, 2, 1};
		int missElm = 0;
		MissingElmInIntegArray findMissElm = new MissingElmInIntegArray();
		missElm = findMissElm.solution(missElmArr);
		System.out.println("missElm is: " + missElm + ", expected 4");
		
		missElm = findMissElm.solution(missElmArr2);
		System.out.println("missElm is: " + missElm + ", expected 2");
		
		missElm = findMissElm.solution(missElmArr3);
		System.out.println("missElm is: " + missElm + ", expected 1");
		
		missElm = findMissElm.solution(missElmArr6);
		System.out.println("missElm is: " + missElm + ", expected 1");
		
		missElm = findMissElm.solution(missElmArr4);
		System.out.println("missElm is: " + missElm + ", expected 2");
		missElm = findMissElm.solution(missElmArr5);
		System.out.println("missElm is: " + missElm + ", expected 1");
		missElm = findMissElm.solution(missElmArr7);
		System.out.println("missElm is: " + missElm + ", expected 6");
		System.out.println();
		
		int mini = 0;
		int[] miniDiffTapeP = {-10, -5, -3, -4, -5};
		MinimumDifferenceTapeP findMini = new MinimumDifferenceTapeP();
		mini = findMini.solution(missElmArr6);
		System.out.println("mini is: " + mini + ", expected 1");
		mini = findMini.solution(missElmArr7);
		System.out.println("mini is: " + mini + ", expected 2");
		mini = findMini.solution(miniDiffTapeP);
		System.out.println("mini is: " + mini + ", expected 3");
		System.out.println();
		
		
		int count = 0;
		int[] node1 = {1, 4, -1, 3, 2};
		int[] node2 = {-1};
		int[] node3 = {-1, 3};
		int[] node4 = {1, 3, 3, 4, 4, 6, 6, 100, -1};
		NodeListLength countLength = new NodeListLength();
		count = countLength.solution(node1);
		System.out.println("list length is: " + count + ", expected 3");
		count = countLength.solution(node2);
		System.out.println("list length is: " + count + ", expected 0");
		count = countLength.solution(node3);
		System.out.println("list length is: " + count + ", expected 0");
		count = countLength.solution(node4);
		System.out.println("list length is: " + count + ", expected 3");
		System.out.println();

	}

}
