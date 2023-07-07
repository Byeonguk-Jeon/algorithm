import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Test04 ts = new Test04();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] array = new String[count];

		for (int i = 0; i < array.length; i++) {

			array[i] = sc.next();

		}

		for (String x : ts.solution(count, array)) {

			System.out.println(x);

		}

		/*
		 * Test04 ts = new Test04();
		 * 
		 * String[] result = ts.solution(array);
		 * 
		 * for (String s : result) { System.out.println(s); }
		 */

	}

	/*
	 * public String[] solution(String[] array) {
	 * 
	 * String[] newArr = new String[array.length];
	 * 
	 * StringBuffer sb = null;
	 * 
	 * for (int i = 0; i < array.length; i++) {
	 * 
	 * sb = new StringBuffer();
	 * 
	 * String str = array[i];
	 * 
	 * for (int j = str.length() - 1; j >= 0; j--) {
	 * 
	 * sb.append(str.charAt(j));
	 * 
	 * }
	 * 
	 * newArr[i] = sb.toString();
	 * 
	 * }
	 * 
	 * return newArr; }
	 */

	public ArrayList<String> solution(int n, String[] array) {

		ArrayList<String> answer = new ArrayList<>();
		for (String x : array) {

			char[] s = x.toCharArray();
			int lt = 0, rt = x.length() - 1;

			while (lt < rt) {

				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;

			}
			String tmp = String.valueOf(s);
			answer.add(tmp);

		}
		return answer;
	}
}
