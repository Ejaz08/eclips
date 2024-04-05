package scanner;

import java.util.Scanner;

public class C 
{
	public static double circumference (int r)
	{
		   int a=2;
		double b=3.14;
		double c=a*b*r;
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner (System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter the value of r");
			int r=s.nextInt();
			System.out.println("result");
			System.out.println(C.circumference(r));
		}
		s.close();
				
	}
}
