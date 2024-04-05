package nested_for_loop;

public class D1234 {

	public static void main(String[] args) 
	{
		int n=4;
		for(int a=1;a<=n;a++)
		{
			for(int b=1;b<=n;b++)
			{                                    
				if(b%2==1)                   
				   {
					   System.out.print(b+" "); 
				   }
				   else
				   {
					   System.out.print(a+" ") ;
				   }
				
		}
			System.out.println();
			}


	}

}
