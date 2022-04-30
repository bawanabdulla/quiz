
public class Prime {

	public static void main(String[] args) {
		System.out.print(isPrime(11));
	}
	
	public static boolean isPrime(int x) {
		int a = (int) Math.sqrt(x);
		
		for(int i = 2; i <= a; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
