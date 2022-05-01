
public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("hejjeh"));
		System.out.println(isPalindrome("hej"));
		System.out.println(isPalindrome("bob"));
		System.out.println(isPalindrome("Bob"));
		
	}

	/**
	 * Checks if a String is a palindrome. Palindrome is when the reversed string equals the original string. 
	 * @param s
	 * @return true if it is a palindrome, otherwise false. 
	 */
	private static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		
		char[] c = s.toCharArray();
		String rev = "";
		
		for(int i = s.length()-1; i >= 0; i--) {
			rev += c[i];
		}
		
		System.out.println(s + " : " + rev + " : " + String.valueOf(c));
		
		if(s.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}
}
