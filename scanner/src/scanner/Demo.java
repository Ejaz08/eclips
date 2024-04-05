package scanner;

import java.util.Scanner;

public class Demo 
{
	void add(char a,int b)
	    {
	    	System.out.println(a+b);
	    }
	void sub(char a,int b)
		{
			System.out.println(a-b);
		}
	void mul(char a,int b)
		{
			System.out.println(a*b);
		}
	void div(char a,int b)
		{
			System.out.println(a/b);
		}		

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st number");
	        char a= s.next().charAt(1);
	        System.out.println("enter 2nd number");
	        int b=s.nextInt();
	        System.out.println("result");
	        
	        Demo D=new Demo();
	        D.add(a,b);
	        
	        System.out.println("enter 1st number");
	        char c= s.next().charAt(1);
	        System.out.println("enter 2nd number");
	        int d=s.nextInt();
	        System.out.println("result");
	        D.sub(c,d);
	        
	        System.out.println("enter 1st number");
	        char e= s.next().charAt(1);
	        System.out.println("enter 2nd number");
	        int f= s.nextInt();
	        System.out.println("result");
	        D.mul(e,f);
	        
	        System.out.println("enter 1st number");
	        char g= s.next().charAt(1);
	        System.out.println("enter 2nd number");
	        int h= s.nextInt();
	        System.out.println("result");
	        D.div(g,h);
	        
	}
}
