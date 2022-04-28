package qa.com.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewSessionWedneday {
	
	public static void main(String[] args) {
	
		List<String> names = new ArrayList<>();
		
		names.add("Phil");
		names.add("James");
		names.add("Rowan");
		names.add("Pawel");
//		
//		System.out.println(names);
//		System.out.println(names.get(3));
//		names.set(1,  "Aswene");
//		System.out.println(names);
//		System.out.println(names.size());
//		System.out.println(names.get(6));
		
		//ENHANCED FOR LOOPS
		
		for (String name : names) {
			System.out.println(name);
			
		}
		
		//REGULAR FOR LOOP
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//IMPORTED COLLECTIONS - USED TO MANIPULATE LISTS TO SORTS, SWAP OR REVERSE ETC
		
		Collections.swap(names, 0, 2);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		
//		List<String> names2 = List.of("James", "George", "Paul");
		
	}
	
	
	
	
	

}
