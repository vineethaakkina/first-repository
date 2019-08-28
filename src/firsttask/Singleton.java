package firsttask;

import java.util.Arrays;
import java.util.HashMap;

public class Singleton {

	private Singleton() {

	}

	private static Singleton firstinstance = null;

	public static Singleton getInstance() {
		if (firstinstance == null) {
			firstinstance = new Singleton();
		} else {
			return firstinstance;
		}
		return firstinstance;
	}

	public HashMap<Integer, String> hmap = new HashMap<Integer, String>();

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
