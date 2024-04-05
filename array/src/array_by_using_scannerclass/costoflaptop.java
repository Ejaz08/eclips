package array_by_using_scannerclass;

import java.util.Scanner;

public class costoflaptop 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of laptops");
		int x=s.nextInt();
		double [] a=new double [x];
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Add the cost");
			a[i]=s.nextDouble();
		}
		for(int j=0;j<=a.length-1;j++)
		{
			System.out.println(a[j]);
		}
}

}
