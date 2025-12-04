package foreach;

import java.util.ArrayList;
import java.util.List;

public class Example {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		//foreach loop- for(datatype variablename:arrayname)
		for(int p:a)
		{
			System.out.println(p);
		}
		List <String> L=new ArrayList <String> ();
		L.add("blue");
		L.add("red");
		L.add("green");
		for(String s:L)
		{
			System.out.println(s);
		}

	}

}
