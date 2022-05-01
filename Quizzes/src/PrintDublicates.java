import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDublicates {

	public static void main(String[] args) {

		int x = 100012242;
		
		printDup(x);

	}

	/**
	 * Takes in a number and checks how many times 
	 * each individual number is occuring. 
	 * Example: 100, 1 is occuring one time and 0 two times. 
	 * @param x
	 */
	public static void printDup(int x) {
		char[] c = Integer.toString(x).toCharArray();

		Arrays.sort(c);

		String res = "";

		for (int i = 0; i < c.length; i++) {
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;

				} else {
					break;
				}
			}

			System.out.println(c[i] + " occurs " + count + " times");
			i = i + (count - 1);
		}

		System.out.println(res);

	}

}
