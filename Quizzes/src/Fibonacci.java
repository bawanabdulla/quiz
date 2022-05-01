
public class Fibonacci {

	public static void main(String[] args) {
		count(10);
	}

	/**
	 * Counts the sum of Fibonacci's sequence for a number n.
	 * The formula for Fibonacci's sequence is Xn+2 = Xn+1 + Xn. 
	 * @param n
	 */
	public static void count(int n) {

		if (n == 0) {
			System.out.println("0");
		} else if (n == 1) {
			System.out.println("0, 1");
		} else {
			int[] arr = new int[n];
			arr[0] = 0;
			arr[1] = 1;

			for (int i = 2; i < n; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + ",  ");
			}

		}
	}
}
