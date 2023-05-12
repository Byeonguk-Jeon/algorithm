import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
	
		int [] array = {-7,-3,2,3,11};
		
		int [] arr = sortedSquares(array);

		for(Integer i : arr) {
			System.out.println(i);
		}
		
	}

	public static int[] sortedSquares(int[] nums) {

		for(int i =0;i<nums.length;i++) {
			
			nums[i] = nums[i] * nums[i];
			
		}
		
		Arrays.sort(nums);

		return nums;
	}
}
