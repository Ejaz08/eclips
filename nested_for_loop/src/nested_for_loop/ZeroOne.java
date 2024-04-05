package nested_for_loop;

public class ZeroOne {

	public static void main(String[] args) 
	{
		int n=4;
		for(int a=1;a<=n;a++)
		{
			for(int b=1;b<=n;b++)
			{
				   if(b==1 || b==3) 
				   {
					   System.out.print("1 ");  // replace by 0
				   }
				   else
				   {
					   System.out.print("0 ");  // replace by 1
				   }
				
		}
			System.out.println();
			}

	}

}
