import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String result = "";
        int length = line.length()+2;
        for(int i =0;i<3;i++) {
        	if(i!=1) {
            	for(int j=0;j<length;j++) {
            		result+="+";
            		if(j==length-1) result+="\n";
            	}
        	}
    		if(i==1) {
    			result+="+"+line+"+"+"\n";
    		}
        	
        }
        
        System.out.println(result);

	}

}
