package scanner;

import java.util.Scanner;

public class B 
{
public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
	    int n= s.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	System.out.println("enter 1st no.");
	    	int a=s.nextInt();
	    	System.out.println("enter 2nd no.");
	    	int b=s.nextInt();
	    	System.out.println("Result");
	    	System.out.println(B.add(a,b));
	    }
	   
	        
	        
	     
	}
}
