
public class Test24 {

	public static void main(String[] args) {
		int num = 15, sum = 0, lt = 0, count = 0;
		int m = num / 2 + 1;
		int[] arr = new int[m];

		for (int i = 0; i < m; i++) {
			arr[i] = i + 1;
		}

		for (int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if (sum == num) {
				count++;
			}
			while (sum >= 15) {
				sum -= arr[lt++];
				if (sum == num)
					count++;
			}
		}
		
		System.out.println(count);
	}
}
