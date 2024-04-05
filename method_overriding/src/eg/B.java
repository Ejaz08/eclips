package eg;

public class B extends A
{
	int b=15;
	@Override
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	@Override
	int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public static void main(String[] args) 
	{
		B x=new B();
	x.add(23,4);
	System.out.println(x.sub(10,5));
	}
	
}
