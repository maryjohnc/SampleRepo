package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set <String> s =new HashSet <String>();

		//add()
		s.add("Green");
		s.add("Violet");
		s.add("Indigo");
		s.add("Red");
		System.out.println(s);
		
		Set <String> a =new HashSet <String>();
		a.add("green");
		a.add("Blue");
		a.add("Orange");
		a.add("Yellow");
		System.out.println(a);
		
		//addAll()
		s.addAll(a);
		System.out.println(s);
		
		//contains
		System.out.println(s.contains("blue"));
		System.out.println(s.contains("Blue"));
		
		//containsAll()
		System.out.println(a.containsAll(s));
		System.out.println(s.containsAll(a));
		
		//isEmpty method
		System.out.println(a.isEmpty());
				
		//size method
		System.out.println(a.size());
		System.out.println(s.size());
		
		//remove
		s.remove("Red");
		System.out.println("After remove  : "+s);
		
		//removeAll()
		s.removeAll(a);
		System.out.println(s);
		
		//clear()
		a.clear();
		System.out.println(a);
		
	}

}
