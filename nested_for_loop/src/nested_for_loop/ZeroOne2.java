package nested_for_loop;

public class ZeroOne2 {

	public static void main(String[] args) 
	{
		int n=4;
		for(int a=1;a<=n;a++)
		{
			for(int b=1;b<=n;b++)
			{                                    
				if(a%2==0 )                   
				   {
					   System.out.print(a+" "); 
				   }
				   else
				   {
					   System.out.print("0 "); 
				   }
				
		}
			System.out.println();
			}

	}

}
