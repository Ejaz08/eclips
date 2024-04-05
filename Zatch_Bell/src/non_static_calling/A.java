package non_static_calling;

public class A
{
	int a=10;
	double b=20;
	long c=30;
	
	void add()
	{
		System.out.println("Start");
	}
	void sub()
	{
		int a=10;
		int b=5;
		int c =a-b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		A x=new A();
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		x.add();
		x.sub();
	}
}
