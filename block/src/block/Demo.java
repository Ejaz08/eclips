package block;

public class Demo 
{
	static int a;
	static
	{
		System.out.println("hi");
		a=20;
	}
	static
	{
		System.out.println("bye");
		a=30;
	}
	static
	{
		a=10;
	}
	static
	{
		System.out.println("hiiiiiiiiiiii");
	}
	public static void main(String[] args) 
	{
		System.out.println(Demo.a);
	}
}