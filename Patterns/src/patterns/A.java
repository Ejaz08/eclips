package patterns;

public class A 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int a=n;a>=1;a--)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
