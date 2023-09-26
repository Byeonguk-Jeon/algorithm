
public class Test15 {

	public static void main(String[] args) {
		
		String str = "luffy is still joyboy";
		int count = 0;
		str=str.trim();
		for(int i = str.length()-1;i>0;i--) {
			count++;
			if(String.valueOf(str.charAt(i)).equals(" ")) {
				break;
			}
		}
		
		System.out.println(count-1);
	}
}
