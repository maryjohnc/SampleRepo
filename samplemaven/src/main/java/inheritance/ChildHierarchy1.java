package inheritance;

public class ChildHierarchy1 extends Parenthierarchy
{
	public void display1()
	{
		System.out.println("This is child class 1");
	}

	public static void main(String[] args) 
	{
		ChildHierarchy1 obj=new ChildHierarchy1();
		obj.display();
		obj.display1();

	}

}
