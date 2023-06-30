import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("•¶Žš‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		String input = sc.next();
		
		String str = "aBtsAxBbCBc";
		
		char input1 = input.charAt(0);
		
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			
			if(check(input1,str.charAt(i))) {
				count++;
			}
			
			
		}
		
		System.out.println("count="+count);
		
	}
	
	public static boolean check(char input1, char c) {
		
		if((int)input1==(int)c) {
			
			return true;
		} else {
			
			if((int)input1==(int)c+32 || (int)input1==(int)c-32) {
				
				return true;
			}
			
		}
		
		return false;
	}

}
