import java.util.ArrayList;

public class Test21 {

	public static void main(String[] args) {

		int[] box = { 1, 2, 3, 5, 9 };
		int p0 = 0;
		int[] box1 = { 2, 3, 5, 7, 8 ,9};
		int p1 = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (p0 < box.length && p1 < box1.length) {
			if (box[p0] == box1[p1]) {
				list.add(box[p0]);
				p0++;
				p1++;
			} else if (box[p0] < box1[p1]) {
				p0++;
			} else {
				p1++;
			}
		}

		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
