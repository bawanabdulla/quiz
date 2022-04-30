
public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

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
