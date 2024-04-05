package single_level;

public class B extends A
{
	double height=5.09;
	
	void enjoy()
	{
		System.out.println("travel");
	}
	public static void main(String[] args) 
	{
		B b=new B();
		b.work();
		b.enjoy();
		System.out.println(b.age);
		System.out.println(b.height);
	}
	
	
	
	
}
