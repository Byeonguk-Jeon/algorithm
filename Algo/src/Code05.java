
public class Code05 {

	public static void main(String[] args) {

		int[] data = { 1, 5, 3, 6, 2, 11 };

		int maxNum = findMax(data, 0, data.length - 1);

		System.out.printf("Max is %d", maxNum);

	}

	static int findMax(int[] data, int begin, int end) {

		if (begin == end)
			return data[begin];
		else
			return Math.max(data[begin], findMax(data, begin + 1, end));

	}

}
