package arraypractice;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class D5 {
	@Test
	void da() {
	String[]name= {"asma","shamim","sayan","suha"};
	//for(String name1:name)
	//System.out.println(name1);
List<String> li=	 Arrays.asList(name);
li.add("anne");
Iterator<String> it=	li.iterator();
while(it.hasNext()) {
System.out.println(it.next());

}
	}

}
