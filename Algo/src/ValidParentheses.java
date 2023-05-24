import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 6 };
		int target = 6;

		int index = searchInsert(arr, target);

		System.out.println("인덱스 : " + index);
	}

	public static int searchInsert(int[] nums, int target) {

        int a = 0;
        int b = 0;
        int c = nums.length-1;
        while(a<=c){
            b = (a+c)/2;
            if(nums[b]==target){
                return b;
            }
            else if(nums[b]<target){
                a = b+1;
            }
            else{
                c = b-1;
            }
        }
        if(target<nums[b]){
            return b;
        }
        else{
            return b+1;
        }
	}
}
