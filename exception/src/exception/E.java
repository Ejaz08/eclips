package exception;
					//nested try and catch exception to get message
public class E {

	public static void main(String[] args)
	{
		int []a= {10,20,30,40,50,60,70};
		try 
		{
			try 
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
		System.out.println(e.getMessage());
			}
			System.out.println(a[100]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}

}


