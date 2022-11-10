
public class Code04 {

	// sequential search
	public static void main(String[] args) {

		int[] data = { 1, 3, 4, 5, 6, 7, 9 };

		int result = search(data, 0, data.length - 1, 10);

		if (result != -1) {

			System.out.printf("The index of target is %d", result);

		} else {

			System.out.println("Not Found");
		}

	}

	static int search(int[] data, int begin, int end, int target) {

		if (begin > end) {
			return -1;
		} else if (target == data[begin]) {

			return begin;

		} else {

			return search(data, begin + 1, end, target);

		}

	}

}
