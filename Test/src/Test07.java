import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Test07 t = new Test07();

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(t.solution(str));

		sc.close();
	}

	public boolean solution(String str) {

			str = str.toUpperCase();
		
			for(int i =0;i<str.length()/2;i++) {
				
				if(!Character.toString(str.charAt(i)).equals(Character.toString(str.charAt(str.length()-1-i)))) return false;
				
			}
				
		return true;
	}	
}
