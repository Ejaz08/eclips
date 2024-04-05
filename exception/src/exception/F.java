package exception;

public class F 
{
	public static void main(String[] args) 
	{
		System.out.println("START");
		System.out.println(10+20);
		System.out.println(10*2);
		
		try 
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("end");
		}
		
		
	System.out.println(10-5);//it will not print because both statements
	System.out.println(10/2);// are not inside the finally block
		
	}
}
