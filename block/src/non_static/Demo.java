package non_static;

public class Demo 
{
	static
	{
		System.out.println("SB1");
	}
	
	{
		System.out.println("NSB1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("hii");
		System.out.println("bye");
		
		Demo D=new Demo();
		
	}
}
