
public class ReverseArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 89, 1299, 3 };
		int[] arr2 = { 1 };
		int[] arr3 = { 1, 2 };

		reverse(arr1);
		reverse(arr2);
		reverse(arr3);
	}

	/**
	 * Takes in an array containing integers and reverse the order of the elements,
	 * then prints it.
	 * 
	 * @param arr
	 */
	public static void reverse(int[] arr) {

		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;

		}

		String res = "{";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				res += arr[i];
			else
				res += arr[i] + ", ";
		}

		res += "}";
		System.out.println(res);
	}
}
