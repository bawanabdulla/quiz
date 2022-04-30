import java.util.Arrays;

public class SmallestNumber {
	
	public static void main(String[] args) {
		int[] x1 = {1,2,4,5,6,7};
		int[] x2 = {1,2,3,4,5,6,7};
		int[] x3 = {2,4,7};
		
		smallest(x1);
		smallest(x2);
		smallest(x3);
	}

	private static void smallest(int[] x) {
		int smallestnbr = Integer.MAX_VALUE; 

		
		Arrays.sort(x);
		
		for(int i = 0; i < x.length; i++) {
			//System.out.println(x[i]);
		}

		for(int i = 0; i < x.length; i++) {
			if(x[i] != i+1) {
				smallestnbr = i+1; 
				break;
			}

		}
		
		if(smallestnbr == Integer.MAX_VALUE) {
			smallestnbr = x.length+1;
		}
		
		System.out.println("Smallest missing number is: "+smallestnbr);
		
	}
}
