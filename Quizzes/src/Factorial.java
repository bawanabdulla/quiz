
public class Factorial {

	public static void main(String[] args) {
		System.out.println(countFactorial(3));
	}
	
	
	/**
	 * Counts the factorial. Factorial 3 is 3*2*1 = 6
	 * @param i
	 * @return Recursive method that returns the factorial of i. 
	 */
	private static int countFactorial(int i) {

		if (i == 0) {
			return 1;
		} else {

			return i * countFactorial(i - 1);
		}

	}
}
