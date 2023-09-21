import java.util.ArrayList;

public class Test12 {

	public static void main(String[] args) {
		int cut = 7;
		String str = "#****###**#####**#####**##**";
		String[] arr = new String[str.length() / cut];
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.substring(0, cut).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(arr[i],2);
			result+=(char)num;
			str = str.substring(cut);
		}

		System.out.println(result);
		/*
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
		*/
	}
}
