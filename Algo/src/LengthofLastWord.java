import java.util.ArrayList;

public class LengthofLastWord {

	public static void main(String[] args) {

		String s = "luffyss is still joyboy";

		int length = lengthOfLastWord(s);
		
		System.out.println(length);
		
	}
	
    public static int lengthOfLastWord(String s) {
        boolean vis=false;
        int ans=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' '){
                if(vis){
                    break;
                }
            }
            else{
                vis=true;
                ans++;
            }
        }
        return ans;
    }

}
