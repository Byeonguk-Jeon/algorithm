
public class Test09 {

	public static void main(String[] args) {
		String str = "a100sdf123dsf23";

		str = str.toUpperCase().replaceAll("[^0-9]", "");
		
		if(str.startsWith("0")) {
			str = str.replaceAll("0", "");
		}
		
		System.out.println(str);
		
	}

}
