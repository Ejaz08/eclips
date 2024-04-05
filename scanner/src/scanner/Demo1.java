package scanner;

import java.util.Scanner;

public class Demo1 
{
	void add(int a,int b)
    {
    	System.out.println(a+b);
    }
void sub(int a,int b)
	{
		System.out.println(a-b);
	}
void mul(int a,int b)
	{
		System.out.println(a*b);
	}
void div(int a,int b)
	{
		System.out.println(a/b);
	}		

public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter 1st number");
        int a= s.nextInt();
        System.out.println("enter 2nd number");
        int b=s.nextInt();
        System.out.println("result");
        
        Demo1 D1=new Demo1();
        D1.add(a,b);
        
        System.out.println("enter 1st number");
        int c= s.nextInt();
        System.out.println("enter 2nd number");
        int d=s.nextInt();
        System.out.println("result");
        D1.sub(c,d);
        
        System.out.println("enter 1st number");
        int e= s.nextInt();
        System.out.println("enter 2nd number");
        int f= s.nextInt();
        System.out.println("result");
        D1.mul(e,f);
        
        System.out.println("enter 1st number");
        int g= s.nextInt();
        System.out.println("enter 2nd number");
        int h= s.nextInt();
        System.out.println("result");
        D1.div(g,h);
        
}
}
