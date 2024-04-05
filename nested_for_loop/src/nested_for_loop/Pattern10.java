package nested_for_loop;

public class Pattern10 {

	public static void main(String[] args)
	{
		int n=3;
		for(int a=1;a<=n;a++)
		{
			for(int b=1;b<=n*2-1;b++)
			{
				if(a+b>=n+1 && b-a<=n-1 )
				   {
					   System.out.print("* ");
				   }
				   else
				   {
					   System.out.print("  ");
				   }
				
		}
			System.out.println();
			}

	}

}
