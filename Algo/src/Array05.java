
public class Array05 {

	public static void main(String[] args) {

		int[] arr = { 3,3};

		int[] result = twoSum(arr, 6);

		for (int x : result) {
			System.out.println(x);
		}

	}

	public static int[] twoSum(int[] nums, int target) {

		int xIndex = 0;
		int yIndex = 0;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					xIndex = i;
					yIndex = j;
					break;
				}

			}

		}

		int[] indexbox = { xIndex, yIndex };

		return indexbox;

	}

}
