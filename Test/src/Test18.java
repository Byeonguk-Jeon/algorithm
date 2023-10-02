
public class Test18 {

	public static void main(String[] args) {
		int box = 5;
		int boxArr [][] = {
				{10,13,10,12,15},
				{12,39,30,23,11},
				{11,25,50,53,15},
				{19,27,29,37,27},
				{19,13,30,13,19}	
		};
		
		int answer = Integer.MIN_VALUE;
		int sum1,sum2;
		for(int i = 0;i<box;i++) {
			sum1=sum2=0;
			for(int j=0;j<box;j++) {
	
				sum1+=boxArr[i][j];
				sum2+=boxArr[j][i];
				
			}	
			answer=Math.max(answer, sum1);
			answer=Math.max(answer, sum2);
			
		}
		sum1=sum2=0;
		for(int i = 0;i<box;i++) {
			sum1+=boxArr[i][i];
			sum2+=boxArr[i][box-i-1];
		}
		answer=Math.max(answer, sum1);
		answer=Math.max(answer, sum2);
		
		System.out.println(answer);
	}
}
