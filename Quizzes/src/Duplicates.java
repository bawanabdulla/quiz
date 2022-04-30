import java.util.ArrayList;

public class Duplicates {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(1);
		arr.add(5);
		arr.add(1);
		arr.add(8);
		arr.add(9);
		arr.add(11);
		arr.add(3);
		arr.add(8);
		arr.add(13);
		
		System.out.println(arr);
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(int i = 0; i<arr.size(); i++) {
			int temp = arr.get(i);
			boolean duplicate = false;
			for(int j = 0; j<arr2.size(); j++) {
				if(temp == arr2.get(j)) {
					duplicate = true;
				} 
				
			}
			if(!duplicate) {
			arr2.add(arr.get(i));
				
			}
		}
		
		System.out.println(arr2);


	}
}
