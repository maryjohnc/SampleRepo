package inheritance;

public class MultilevelChild extends MultilevelParent
{
   public void display2()
   {
	   System.out.println("this is child class");
   }
	public static void main(String[] args) 
	{
		MultilevelChild obj=new MultilevelChild();
		obj.display();
		obj.display1();
		obj.display2();

	}

}
