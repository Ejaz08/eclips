package changecalling;

public class A 
{
	A()
	{
		this(10);
		System.out.println("1");
		
	}
	A(int a)
	{
		this("java",10);
		System.out.println("2");
		
	}
	A(String name,int b)
	{
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		A x=new A();
		
	}
}
