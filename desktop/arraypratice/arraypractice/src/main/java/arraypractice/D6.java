package arraypractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class D6 {

	public static void main(String[] args) {
		int j=0;

		String[] a = { "asma", "shamim", "shamama", "suha" };
		int size=a.length;
	List<String> li=	Arrays.asList(a);
	while(li.iterator().hasNext()) {
		System.out.println(li.indexOf("suha"));
		break;
	}
Iterator<String>it=	li.iterator();

while(it.hasNext()) {
	j++;
	System.out.println(it.next());
	if(j==size) {
		break;
	}
	
}
		
	}

}
