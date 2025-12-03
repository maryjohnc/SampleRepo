package exceptionhandling;

public class CustomException1 
{

	public static void main(String[] args) throws AgeException
	{
		int age=14;
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		else 
			//System.out.println("not eligible to vote");
			throw new AgeException("not eligible to vote");

	}
		

	}
