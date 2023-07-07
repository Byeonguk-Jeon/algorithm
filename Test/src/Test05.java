import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		Test05 t = new Test05();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(t.solution(str));

		sc.close();

	}

	public String solution(String str) {

		int lt = 0;
		int rt = str.length() - 1;

		char[] arr = new char[str.length()];

		while (lt < rt) {

			char a = str.charAt(lt);
			char b = str.charAt(rt);

			if (checkAlphabet(a, b)) {

				char temp = a;
				a = b;
				b = temp;
				arr[lt] = a;
				arr[rt] = b;
				lt++;
				rt--;
			} else {

				arr[lt] = a;
				arr[rt] = b;
				lt++;
				rt--;
			}

		}
		
		if(!(str.length()%2==0)) {
		
			arr[str.length()/2] = str.charAt(str.length()/2);

		}
		
		String result = String.valueOf(arr);

		return result;

	}

	public boolean checkAlphabet(char a, char b) {

		int num0 = (int) a;
		int num1 = (int) b;

		if ((65 <= num0 && num0 <= 90 || 97 <= num0 && num0 <= 122) && (65 <= num1 && num1 <= 90 || 97 <= num1 && num1 <= 122)) {

			return true;
		}

		return false;
	}
}
