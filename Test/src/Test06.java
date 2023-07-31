import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Test06 t = new Test06();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(t.solution(str));

		sc.close();

	}
	
	public String solution(String str) {

		String answer = "";
		
		for(int i =0;i<str.length();i++) {
			//System.out.println(str.charAt(i)+" "+i+" "+ str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
		
		}
		
		return answer;
	}	

}
