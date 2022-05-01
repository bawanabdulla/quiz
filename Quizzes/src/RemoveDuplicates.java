import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5,5,6,2};
		
		removeDuplicate(x);
	}

	
	/**
	 * Takes in an array containing Integers and prints it without duplicates.
	 * This is done without using Java Collection methods to get rid of duplicates. 
	 * @param x
	 */
	private static void removeDuplicate(int[] x) {
		
		Arrays.asList(x);
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(int i = 0; i < x.length-1; i++) {
			if(x[i] != x[i+1]) {
				res.add(x[i]);
			}
		}
		
		System.out.println(res);
		
	}
}
