public class Test23 {

	public static void main(String[] args) {

		int target = 6;
		int arr[] = { 1, 2, 1, 3, 1, 1, 1, 2 }; //213 // 1311 // 3111
		int sum = 0;
		int count = 0, lt = 0;
		for(int rt=0;rt<arr.length;rt++) {
			sum+=arr[rt];
			if(sum==target) {
				count++;
			}
			while(sum>=target) {
				sum-=arr[lt++];
				if(sum==target) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
