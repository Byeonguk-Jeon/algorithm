
public class Test22 {

	public static void main(String[] args) {
		int[] box = { 12, 115, 11, 22, 25, 10, 20, 19, 113, 15 };

		int max = box[0] + box[1] + box[2];
		int sum = 0;
		for (int i = 1; i < box.length - 3; i++) {

			sum = box[i] + box[i + 1] + box[i + 2];
			if (max < sum) {
				max = sum;
			}

		}
		System.out.println(max);
	}
}
