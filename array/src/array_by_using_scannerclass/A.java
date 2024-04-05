package array_by_using_scannerclass;
import java.util.Scanner;
public class A 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int x=s.nextInt();
		int [] a=new int [x];
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Add the value in array");
			a[i]=s.nextInt();
		}
		for(int j=0;j<=a.length-1;j++)
		{
			System.out.println(a[j]);
		}
}
}
//wjp to create a bangalore fc and store the players name and fech it by using of scannerclass