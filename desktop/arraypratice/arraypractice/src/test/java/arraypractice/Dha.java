package arraypractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Dha {

	public static void main(String[] args) {
		String[] name = { "asma", "shamim", "sayan", "suha" };
		for (String name1 : name)
			System.out.println(name1);
		List<String> li = Arrays.asList(name);
		boolean b = li.contains("asma");
		while (b == true) {
			int index = li.indexOf("asma");

		}

		System.out.println(b);
		Iterator<String> it = li.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
