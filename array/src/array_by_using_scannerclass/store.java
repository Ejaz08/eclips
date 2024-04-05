package array_by_using_scannerclass;

import java.util.Scanner;

public class store 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of charecter");
		int x=s.nextInt();
		char [] a=new char [x];
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Add the value");
			a[i]=s.next().charAt(0);
			
		}
		for(int j=0;j<=a.length-1;j++)
		{
			System.out.println(a[j]);
		}
}
}
