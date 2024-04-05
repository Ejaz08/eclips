package scanner;

import java.util.Scanner;

public class Patteren {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n= s.nextInt();
		
		for(int a=1;a<=n;a++)
		{
			for(int b=1;b<=n;b++)
			{
				if(a==1 || b==n ||a==b)
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
