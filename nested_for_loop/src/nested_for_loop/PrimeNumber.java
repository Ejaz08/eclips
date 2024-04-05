package nested_for_loop;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int a=1;
		int b=30;
		
		for(int i=a;i<=b;i++)
		{
			int count=0;
			for (int j=1;j<=i;j++)
			{
				if (i%j==0) 
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
			
		
	}

}
