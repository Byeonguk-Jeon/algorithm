
public class Test22 {

	public static void main(String[] args) {
		int[] box = { 12, 15, 11, 20, 25, 10, 20, 19, 13, 15 };

		int max = 38;
		int sum = 0;
		for (int i = 1; i < box.length - 3; i++) {

			sum = box[i] + box[i+1] + box[i+2];
			if(max<sum) {
				max=sum;
			}

		}
		System.out.println(max);
	}
}
