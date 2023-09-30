
public class Test17 {

	public static void main(String[] args) {
		
		int num = 5;
		int [] score = {89,100,100,87,76};
		int [] grade = new int[num];
		int count = 1;
		
		for(int i = 0;i<score.length;i++) {
	
			for(int j = 0;j<score.length;j++) {
				if(score[i]<score[j]) {
					count++;
				}
			}
			grade[i] = count;
			count = 1;
		}
		
		for(Integer i : grade) {
			System.out.println(i);
		}
	}
}
