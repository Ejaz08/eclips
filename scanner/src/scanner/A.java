package scanner;

import java.util.Scanner;

public class A 
{
	int add(int a,int b)
    {
    	int c=a+b;
    	return c;
    }
int sub(int a,int b)
	{
	int c=a-b;
	return c;
	}
int mul(int a,int b)
	{
	int c=a*b;
	return c;
	}	
int div(int a,int b)
	{
	int c=a/b;
	return c;

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
