
public class Test13 {

	public static void main(String[] args) {

		int[] arr = { 130, 135, 148, 140, 145, 150, 150, 153 };

		int max = 0;
		int count = 1;
		max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (max < arr[i]) {

				count++;
				max = arr[i];

			}
		}
		System.out.println(count);
	}
}
