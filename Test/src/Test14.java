
public class Test14 {

	public static void main(String[] args) {
	
		int x=1;
		int y=1;
		int sum = 0;
		// 1,1,2,3,5
		int count = 10;
		
		int [] arr = new int[count];
		
		arr[0]=1;
		arr[1]=1;
		
		for(int i = 2;i<count;i++) {
			
			sum = x+y;
			arr[i] = sum;
			x = y;
			y = sum;
		}
		
		for(Integer i: arr) {
			System.out.println(i);
		}
	}
}
