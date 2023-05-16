
public class Array04 {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };

		duplicateZeros(arr);

	}

	public static void duplicateZeros(int[] arr) {

		int result[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				int loc = i;

				for (int j = 0; j < loc; j++) {

					result[j] = arr[j];
					result[loc] = 0;

				}
				for (int z = loc + 1; z < arr.length; z++) {
					result[z] = arr[z - 1];
				}

			}

		}

		for (int k = 0; k < arr.length; k++)
			System.out.println(result[k]);

	}

}
