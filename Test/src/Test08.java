import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Test08 t = new Test08();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(t.solution(str));

		sc.close();
	}

	public String solution(String str) {

		String answer = "NO";
		str=str.toUpperCase().replaceAll("[^A-Z]", "");
		String temp = new StringBuilder(str).reverse().toString();
		for(int i =0;i<str.length()/2;i++) {
			
			if(str.equals(temp)) answer = "YES";
			
		}

	return answer;
}	
}
