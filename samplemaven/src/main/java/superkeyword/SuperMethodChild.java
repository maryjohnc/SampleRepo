package superkeyword;

public class SuperMethodChild extends SuperMethodParent
{
	public void display()
	{
		System.out.println("super child method");
		super.print();
	}

	public static void main(String[] args) 
	{
		SuperMethodChild obj=new SuperMethodChild();
		obj.display();

	}

}
