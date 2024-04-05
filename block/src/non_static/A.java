package non_static;

public class A 
{
	static
	{
		System.out.println("SB1");
	}
	
	{
		System.out.println("Nsb1");
	}
	static
	{
		A a5=new A();
	}
	
	{
		System.out.println("NSB2");
	}
	static
	{
		System.out.println("gefd");
	}
	{
		System.out.println("bfdg");	}
	public static void main(String[] args) 
	{
		A a=new A();
		System.out.println("hii");
		A a2=new A();
		A a3=new A();
	}
}

