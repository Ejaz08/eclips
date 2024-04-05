package block;

public class Demo1 
{
	static int a=20;
	static int b=28;

	static void add()
	{
		System.out.println(a+b);
		
	}
	static
	{
		a=23;
		b=29;
		System.out.println("welcome");	
	}
	static
	{
		a=24;
		System.out.println("hii");
	}
		public static void main(String[] args) 
	{
		System.out.println(Demo1.a);
		System.out.println(Demo1.b);
		Demo1.add();
	}
}

