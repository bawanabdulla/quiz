
public class Reverse {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,89,1299,3};
		
		for(int i = 0; i<arr1.length/2; i++) {
		
				int temp = arr1[i];
				arr1[i] = arr1[arr1.length - i -1];
				arr1[arr1.length - i -1] = temp;
		
		}
		
		for(int i = 0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}
