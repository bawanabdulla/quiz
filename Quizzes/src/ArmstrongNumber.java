
public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.println(isArmstrong(153));
		System.out.println(isArmstrong(720));
		System.out.println(isArmstrong(400));
		System.out.println(isArmstrong(1));
	}

	/**
	 * Checks if a number is an Armstrong number. An Armstrong number of three digits 
	 * is an integer such that the sum of the cubes of its digits is equal to the number itself.
	 * Example = 100 is not an Armstrong number since 1^3 + 0^3 + 0^3 != 100
	 * @param x
	 * @return true if x is an Armstrong number and false if it is not. 
	 */
	private static boolean isArmstrong(int x) {
		String s1 = Integer.toString(x);
		int[] x1 = new int[s1.length()];

		for (int i = 0; i < x1.length; i++) {
			x1[i] = Character.getNumericValue(s1.charAt(i));
		}

		int sum = 0;
		for (int i = 0; i < x1.length; i++) {
			sum += Math.pow(x1[i], 3);
		}

		if (sum == x) {
			return true;
		} else {
			return false;
		}
	}
}
