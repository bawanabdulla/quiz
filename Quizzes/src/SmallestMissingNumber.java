import java.util.Arrays;

public class SmallestMissingNumber {

	public static void main(String[] args) {
		int[] x1 = { 1, 2, 4, 5, 6, 7 };
		int[] x2 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] x3 = { 2, 4, 7 };
		int[] x4 = { 4, 7 };

		smallestMissingNbr(x1);
		smallestMissingNbr(x2);
		smallestMissingNbr(x3);
		smallestMissingNbr(x4);
	}

	/**
	 * Takes in an array containing integers.
	 * Finds the smallest number missing in the order and prints it.
	 * The missing number must be greater than 0. 
	 * Example: {1,2,3,5,6,8,20}, the smallest number missing is 4. 
	 * @param x
	 */
	private static void smallestMissingNbr(int[] x) {
		int smallestnbr = Integer.MAX_VALUE;

		Arrays.sort(x);

		for (int i = 0; i < x.length; i++) {
			// System.out.println(x[i]);
		}

		for (int i = 0; i < x.length; i++) {
			if (x[i] != i + 1) {
				smallestnbr = i + 1;
				break;
			}

		}

		if (smallestnbr == Integer.MAX_VALUE) {
			smallestnbr = x.length + 1;
		}

		System.out.println("Smallest missing number is: " + smallestnbr);

	}
}
