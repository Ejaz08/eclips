package construction;

public class A 
{
	int a;
	int b=20;
	A()
	{
		System.out.println(b);
	}
	A(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	A(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		A x= new A (10);
	//	System.out.println(x.a);
		
		A z=new A();
		A y=new A(10,20);
		
		
		
		
		
	}
}
