
public class Test10 {

	public static void main(String[] args) {

		String str = "tteachermode";

		String gomi = str.split("e")[0];

		int[] arr = new int[str.length()];

		for (int i = 0; i < gomi.length(); i++) {
			arr[i] = 1000;
		}

		String result = "";
		int count = 0;

		for (int i = gomi.length(); i < str.length(); i++) {

			if ("e".equals(String.valueOf(str.charAt(i)))) {
				count = 0;
				arr[i] = count;

			} else {
				arr[i] = count;
			}

			count++;
		}

		for (Integer i : arr) {
			System.out.println(i);
		}

	}

}
