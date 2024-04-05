package constructor;

public class Eg1 
{
	static int a=10;
	static int b=20;
		   int c=30;
		   int d=40;
	public static void add()
	{
		System.out.println(10+20);
		System.out.println(a+b);
	}
	public void sub()
	{
		System.out.println(10-5);
		System.out.println(c+d);
	}
	public static void main(String[] args) 
	{
		//static
		System.out.println(Eg1.a);
		System.out.println(Eg1.b);
		Eg1.add();
		
		//non-static
		Eg1 A=new Eg1();
		System.out.println(A.c);
		System.out.println(A.d);
		A.sub();
}
}