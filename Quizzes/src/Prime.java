
public class Prime {

	public static void main(String[] args) {
		System.out.println(isPrime(11));
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(0));
		System.out.println(isPrime(6));
		
	}

	/**
	 * Checks if a number is a prime number. 
	 * @param x
	 * @return true if x is a prime, and false if not. 
	 */
	public static boolean isPrime(int x) {
		if(x == 0 || x == 1)
			return false;
		
		int a = (int) Math.sqrt(x);

		for (int i = 2; i <= a; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
