import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] array = new String[count];

		for (int i = 0; i < array.length; i++) {

			array[i] = sc.next();

		}

		Test04 ts = new Test04();

		String[] result = ts.solution(array);

		for (String s : result) {
			System.out.println(s);
		}

	}

	public String[] solution(String[] array) {

		String[] newArr = new String[array.length];

		StringBuffer sb = null;

		for (int i = 0; i < array.length; i++) {

			sb = new StringBuffer();

			String str = array[i];

			for (int j = str.length() - 1; j >= 0; j--) {

				sb.append(str.charAt(j));

			}

			newArr[i] = sb.toString();

		}

		return newArr;
	}
}
