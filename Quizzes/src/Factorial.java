
public class Factorial {

	public static void main(String[] args) {
		System.out.println(countFactorial(3));
	}

	private static int countFactorial(int i) {

		if (i == 0) {
			return 1;
		} else {

			return i * countFactorial(i - 1);
		}

	}
}
