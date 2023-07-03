import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Test02 t = new Test02();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(t.solution(str));

		sc.close();
	}

	public String solution(String str) {

		String answer = "";

		for (Character text : str.toCharArray()) {
			if (Character.isLowerCase(text))
				answer += Character.toUpperCase(text);
			else
				answer += Character.toLowerCase(text);

		}

		return answer;
	}

}
