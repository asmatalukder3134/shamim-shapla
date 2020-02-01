package arraypractice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class D3 {
	@Test
	void abc() {
		String[]name= {"asma","shamim","sayan","suha"};
		//for(String name1:name)
		//System.out.println(name1);
	ArrayList<String> li=	(ArrayList<String>) Arrays.asList(name);
Iterator<String> it=	li.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	
	}}
	

}
