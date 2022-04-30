import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDublicates {

	public static void main(String[] args) {
		
		int x = 100012242;
		
		char[] c = Integer.toString(x).toCharArray();
		
		System.out.println(c);
		
		Arrays.sort(c);
		
		System.out.println(c);
		
		String res = "";

		
		for(int i = 0; i < c.length; i++) {
			int count = 1;
			for(int j = i+1; j < c.length; j++) {
				if(c[i] == c[j]) {
					count++;
					
				} else {
				break;
			}
			}
		
			System.out.println(c[i] + " occurs " + count + " times");
			i = i + (count-1);
		}
		
		System.out.println(res);
	}
	
}
