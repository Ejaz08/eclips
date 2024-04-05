package exception;

public class B 
{
	public static void main(String[] args) 
	{
		for(int a=1;a<=5;a++)
		{
			System.out.println(a);
			
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
		}
	}
}
