
public class Test16 {

	public static void main(String[] args) {
		int n = 20;
		int answer = 0;
		int ch [] = new int[n+1];
		
		for(int i = 2;i<=n;i++) {
			if(ch[i] == 0) {
				answer++;
				for(int j=i;j<=n;j=j+i) ch[j] = 1;
				
			}
		}
		System.out.println(answer);
	}
}
