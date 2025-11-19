package inheritance;

public class ChildHierarchy2 extends Parenthierarchy
{
	public void display2()
	{
		System.out.println("This is child class 2");
	}

	public static void main(String[] args) 
	{
		ChildHierarchy2 obj1=new ChildHierarchy2();
		obj1.display();
		obj1.display2();

	}

}
