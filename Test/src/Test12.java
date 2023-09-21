import java.util.ArrayList;

public class Test12 {

	public static void main(String[] args) {
		String str = "#****###**#####**#####**##**";
		String[] arr = new String[str.length() / 7];

		int cut = 7;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.substring(0, cut);
			str = str.substring(cut);
		}

		ArrayList<String> list = new ArrayList<String>();
		String box = "";
		for (String s : arr) {
			for (int i = 0; i < s.length(); i++) {
				if (String.valueOf(s.charAt(i)).equals("#")) {
					box += "1";
				} else {
					box += "0";
				}
			}
			list.add(box);
			box = "";
		}
		String result = "";
		for (String x : list) {
			result += String.valueOf((char) Integer.parseInt(x, 2));
		}
		
		System.out.println(result);
	}
}
