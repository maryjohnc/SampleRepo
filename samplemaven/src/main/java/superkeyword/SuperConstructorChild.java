package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent
{
	public SuperConstructorChild()
	{
		super(2,3);
		System.out.println("child constructor class");
		
	}

	public static void main(String[] args) 
	{
		SuperConstructorChild obj=new SuperConstructorChild();

	}

}
