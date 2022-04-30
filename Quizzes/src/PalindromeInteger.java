
public class PalindromeInteger {

	public static void main(String[] args) {
		System.out.println(isPal(1000000021));
	}

	private static boolean isPal(int x) {
		String s1 = Integer.toString(x);
		String s2 = reverse(s1);
		if(s1.equals(s2)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private static String reverse(String s) {
		char[] c = s.toCharArray();
		String rev = "";
		
		for(int i = s.length()-1; i >= 0; i--) {
			rev += c[i];
		}
		return rev;
	}
}
