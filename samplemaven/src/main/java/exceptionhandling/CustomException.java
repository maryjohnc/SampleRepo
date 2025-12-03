package exceptionhandling;

public class CustomException 
{

	public static void main(String[] args) throws VotingException 
	{
		int age=14;
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		else 
			//System.out.println("not eligible to vote");
			throw new VotingException("not eligible to vote");

	}

	}
