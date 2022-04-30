import java.util.ArrayList;

public class ArrayListExercises {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 1; i <= 100; i++) {
			arr.add(i);
		}

		arr.set(0, 30);

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		boolean found = false;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == 137) {
				found = true;
			}

		}
		System.out.println(found);

		arr.removeAll(arr);

		arr.add(1);
		arr.add(8);
		arr.add(3);

		// ArrayList<Integer> arr2 = new ArrayList<Integer>();

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.size() + " " + arr.get(i));
		}
	}

}
