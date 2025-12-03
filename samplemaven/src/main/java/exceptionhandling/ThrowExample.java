package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) 
	{
		int age=14;
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		else 
			//System.out.println("not eligible to vote");
			throw new NumberFormatException("not eligible to vote");

	}

}
