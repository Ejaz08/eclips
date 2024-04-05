package exception;
		//e.g. for unchecked exception
public class C 
{
	public static void main(String[] args) 
	{
		int []a= {10,20,30,40,50,60,70};
		
		try
		{
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}
}
	