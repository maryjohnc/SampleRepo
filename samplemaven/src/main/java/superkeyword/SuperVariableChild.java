package superkeyword;

public class SuperVariableChild extends SuperVariableParent
{
	String s="Blue";
	public void print()
	{
		System.out.println(s);
		System.out.println(super.s);
	}

	public static void main(String[] args)
	{
		SuperVariableChild obj=new SuperVariableChild();
		obj.print();

	}

}
