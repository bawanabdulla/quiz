
public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println(isPal("hejjeh"));
	}

	private static boolean isPal(String s) {
		char[] c = s.toCharArray();
		String rev = "";
		
		for(int i = s.length()-1; i >= 0; i--) {
			rev += c[i];
		}
		
		System.out.println(s + ", " + rev + ": " + String.valueOf(c));
		if(s.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}
}
