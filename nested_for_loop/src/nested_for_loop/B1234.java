package nested_for_loop;

public class B1234 {

	public static void main(String[] args) 
	{
		int n=3;
		for(int a=0;a<=n;a++)
		{
			for(int b=0;b<=n;b++)
			{                                    
				if(a%2==0 || a%2==1 )                   
				   {
					   System.out.print(a+" "); 
				   }
				   else
			
				   {
					   System.out.print("  ") ;
				   }
				
	     	}
			System.out.println();
		}

	}

}
