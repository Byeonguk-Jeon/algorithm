
public class Array02 {

	public static void main(String[] args) {

		int[] arr = { 1, 12, 234, 4123, 124, 1, 12, 123, 1234 };

		int output = findNumbers(arr);

		System.out.println("The count of Even Number is " + output);

	}

	public static int findNumbers(int[] nums) {

		int count = 0;

		for (Integer num : nums) {

			if (Integer.toString(num).length() % 2 == 0) {
				count++;
			}

		}

		return count;
	}

}
