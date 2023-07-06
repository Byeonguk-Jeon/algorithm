import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Test03 t = new Test03();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(t.solution(str));

		sc.close();
	}

	public String solution(String str) {

		String result = "";
		int m = Integer.MIN_VALUE;
		
		while(str.indexOf(" ")!=-1) {
			String tmp = str.substring(0, str.indexOf(" "));
			if(tmp.length() > m) {
				m = tmp.length();
				result = tmp;
				
			}
			
			str = str.substring(str.indexOf(" ")+1);
		}
		
		
		/*
		 * String[] arr = str.split(" "); int max = arr[0].length(); List<Integer> list
		 * = new ArrayList<Integer>();
		 * 
		 * for (int i = 1; i < arr.length; i++) {
		 * 
		 * if (max < arr[i].length()) { max = arr[i].length(); } }
		 * 
		 * for(int i =0;i<arr.length;i++) { if(arr[i].length()==max) {
		 * 
		 * list.add(i); }
		 * 
		 * }
		 */
		//arr[list.get(0)]
		
		if(result.length() == str.length()) {
			
			return result;
		} else if (result.length() < str.length()){
			
			return str;
		} else {
			
			return result;
		}

	}

}
