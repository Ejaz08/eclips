package method;

public class F 
{
public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
public static void add(int a,int b,int c)
		{
		    System.out.println(a+b+c);
		}
public static void add(char a,int b,char c)
	{
    	System.out.println(a+b+c);
	}
public static void add(char a,int b) 
		{
			System.out.println(a+b);
		}
public static void add(int a,int b,int c,int d,char e)
	{
		System.out.println(a+b+c+d+e);
	}
public static void main(String[] args) 
{
	F.add(10,20);
	F.add(10,20,30);
	F.add('A',10,'B');
	F.add('#',25);
	F.add(10,20,40,50,'A');
}
}
