
public class PalindromeInteger {

	public static void main(String[] args) {
		System.out.println(isPalindrome(1000000021));
		System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(1001));
		System.out.println(isPalindrome(12231));
	}

	
	/**
	 * Checks if a number is a palindrome. 
	 * A palindrome number is a number which the reversed order
	 * of its number equals the original number. 
	 * Example: 24, the reversed is 42.
	 * 24 != 42 and therefore 24 is not a palindrome number.. 
	 * @param x
	 * @return true if it is a palindrome number. 
	 */
	private static boolean isPalindrome(int x) {
		String s1 = Integer.toString(x);
		String s2 = reverse(s1);
		
		if (s1.equals(s2)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * This method takes in a string and reverse it. 
	 * @param s
	 * @return rev, which is a reversed version on s. 
	 */
	private static String reverse(String s) {
		char[] c = s.toCharArray();
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev += c[i];
		}
		return rev;
	}
}
