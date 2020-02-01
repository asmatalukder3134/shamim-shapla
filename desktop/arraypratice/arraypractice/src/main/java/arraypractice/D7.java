package arraypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D7 {

	public static void main(String[] args) {
		String[]a= {"suha","sayfan"};
		List li=new ArrayList(Arrays.asList(a));
		li.add("asma");
		li.add("shamim");
		System.out.println(li);

	}

}
