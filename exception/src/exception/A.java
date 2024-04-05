package exception;

public class A {

	public static void main(String[] args) 
	{
		System.out.println("START");
		System.out.println(10+20);
		System.out.println(10*2);
		
		try 
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("we can not divide 10 by 0-->"+1);
		}
		catch(RuntimeException e)
		{
			System.out.println("we can not divide 10 by 0-->"+2);
		}
		catch(Exception e)
		{
			System.out.println("we can not divide 10 by 0-->"+3);
		}
		
		System.out.println(10-5);
		System.out.println(10/2);
		System.out.println("END");
	}

}
