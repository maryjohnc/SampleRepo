package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) 
	{
		List <String> a=new ArrayList <String>();
		
		//add method
		a.add("green");
		a.add("blue");
		a.add("red");
		a.add("violet");
		a.add("green");
		System.out.println(a);
		
		//get method
		String s=a.get(2);
		System.out.println(s);
		System.out.println(a.get(1));
		
		//set method
		a.set(1, "white");
		System.out.println(a);
		
		//indexOf method
		System.out.println(a.indexOf("green"));
		System.out.println(a.indexOf("white"));
		
		//lastIndexOf method
		System.out.println(a.lastIndexOf("green"));
		
		//remove method
		a.remove(2);
		System.out.println(a);
		a.remove("green");
		System.out.println(a);
		
		//contains method
		System.out.println(a.contains("violet"));
		System.out.println(a.contains("red"));
		
		//isEmpty method
		System.out.println(a.isEmpty());
		
		//size method
		System.out.println(a.size());
		}

}
