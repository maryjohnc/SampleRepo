package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
    List L=new ArrayList ();
		
		//add method
		L.add("green");
		L.add(1);
		L.add(2.5);
		L.add("violet");
		L.add("green");
		System.out.println(L);
		
		//get method
		System.out.println(L.get(1));
		
		//set method
		L.set(3, "white");
		System.out.println(L);
		
		//indexOf method
		System.out.println(L.indexOf("green"));
		System.out.println(L.indexOf(2.5));
		
		//lastIndexOf method
		System.out.println(L.lastIndexOf("green"));
		
		//remove method
		L.remove(1);
		System.out.println(L);
		L.remove("green");
		System.out.println(L);
		
		//contains method
		System.out.println(L.contains("green"));
		System.out.println(L.contains(1));
		
		//isEmpty method
		System.out.println(L.isEmpty());
		
		//size method
		System.out.println(L.size());
		
	}

}