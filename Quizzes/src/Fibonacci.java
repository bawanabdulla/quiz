
public class Fibonacci {

	public static void main(String[] args) {
		count(10);
	}

	public static void count(int x) {

		if (x == 0) {
			System.out.println("0");
		} else if (x == 1) {
			System.out.println("0, 1");
		} else {
			int[] arr = new int[x];
			arr[0] = 0;
			arr[1] = 1;

			for (int i = 2; i < x; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + ",  ");
			}

		}
	}
}
