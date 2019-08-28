package firsttask;

import java.util.Arrays;
import java.util.HashMap;

public class Hashmapmain {

	public HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	private static Hashmapmain firstinstance = null;

	public static Hashmapmain getInstance() {
		if (firstinstance == null) {
			firstinstance = new Hashmapmain();
		}else {
			return firstinstance;
		}
		return firstinstance;
	}

	public void put(Integer i, String s) {
		hmap.put(i, s);
		System.out.println(Arrays.asList(hmap));
	}
	
	public static void main(String[] args) {

		Hashmapmain hms = Hashmapmain.getInstance();

		hms.put(1, "vini");
		hms.put(2, "sudha");
		hms.put(3, "akkina");

	}

}

//class Hashmain {
//
//	public static void main(String[] args) {
//
//		Hashmapmain hms = Hashmapmain.getInstance();
//
//		hms.put(1, "vini");
//		hms.put(2, "sudha");
//		hms.put(3, "akkina");
//
//	}
//
//}
