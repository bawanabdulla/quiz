
public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse(null));
		System.out.println(reverse("Hello"));
	}

	
	/**
	 * Takes in a string and returns it reversed.
	 * @param string
	 * @return
	 */
	private static String reverse(String string) {
		String rev = "";
		try {
			char[] c = string.toCharArray();

			for (int i = 0; i < c.length; i++) {
				rev += c[c.length - i - 1];
			}

		} catch (Exception e) {
			System.out.println("Null is not accepted as input");
		}

		return rev;

	}
}
