package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) 
	{
		Set s= new HashSet();
		
		//add()
		s.add("Green");
		s.add("violet");
		s.add(1000);
		s.add(23);
		s.add("green");
		s.add("&&");
		System.out.println("Set s :"+s);
		
		Set <String> a= new HashSet<String>();
		a.add("blue");
		a.add("yellow");
		a.add("red");
		a.add(null);
		System.out.println("Set a :"+a);
		
		//addAll()
		s.addAll(a);
		System.out.println("s+a   :"+s);
		
		//contains()
		System.out.println(s.contains("Green"));
		
		//containsAll
		System.out.println("s.Conatins all a :"+s.containsAll(a));
		
		//isEmpty()
		System.out.println(a.isEmpty());
		
		//remove()
		s.remove("blue");
		System.out.println("After remove  : "+s);
		
		//removeAll()
		s.removeAll(a);
		System.out.println("After removeAll a: "+s);
		
		//size()
		System.out.println(a.size());
		System.out.println(s.size());
		
		//clear()
		a.clear();
		s.clear();
		System.out.println(a);
		System.out.println(s);
		
		//size after clear
		System.out.println(a.size());
		System.out.println(s.size());

	}

}
