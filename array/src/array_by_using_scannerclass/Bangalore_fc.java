package array_by_using_scannerclass;

import java.util.Scanner;

public class Bangalore_fc 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int x=s.nextInt();
		String [] a=new String [x];
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Add the value in array");
			a[i]=s.next();
		}
		for(int j=0;j<=a.length-1;j++)
		{
			System.out.println(a[j]);
		}
}

}
