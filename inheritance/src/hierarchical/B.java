package hierarchical;

public class B extends A
{
	int b=20;
	
	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
	}
}
