import java.util.ArrayList;

public class Test20 {

	public static void main(String[] args) {

		int[] array0 = { 1, 3, 5 };

		int[] array1 = { 2, 3, 6, 7, 9 };
		ArrayList<Integer> box = new ArrayList<Integer>();
		int pointer0 = 0;
		int pointer1 = 0;
		
		while (pointer0 < array0.length && pointer1 < array1.length) {

			if(array0[pointer0] < array1[pointer1]) {
				box.add(array0[pointer0++]);
			} else {
				box.add(array1[pointer1++]);
			}

		}
		
		while(pointer0<array0.length) box.add(array0[pointer0++]);
		while(pointer1<array1.length) box.add(array1[pointer1++]);


		for (Integer i : box) {
			System.out.println(i);
		}

	}
}
