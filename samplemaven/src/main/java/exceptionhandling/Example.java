package exceptionhandling;

public class Example 
{

	public static void main(String[] args) 
	{
		int a=8;
		int b=0;
		try
		{
		int c =a/b;
		}
		/*catch(ArithmeticException d)
		{
			b=2;
			int s=a/b;
			System.out.println(s);
			System.out.println(d);
		}*/
		finally
		{
			System.out.println("mandatory statements");
		}
		}

	}
