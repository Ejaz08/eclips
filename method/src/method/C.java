package method;

public class C 
{
	static int a=30;
	public static void add()
	{
		System.out.println(10+20);
	}	
	public static void add(int a, int b) 
	{
		int c=a+b;
		System.out.println(c);
	}
	public static int add (int a, int b,int c) 
	{
		int d=a+b+c;
		return d;
	}
	public static int add (int a)
	{
		int c=a+a;
		return c;
	}
	public static void main(String[] args) 
	{
		int a=10;
		C.add();
		System.out.println(C.add(10,20,30));
		System.out.println(C.add(20));
		C.add(20,40);
		System.out.println(a);
		C.add(10,20,40);
	}
}