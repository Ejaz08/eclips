package tostring;

public class B 
{
	int sal;
	
	B(int sal)
	{
		this.sal=sal;
	}
	
	public String toString()
	{
		return "my salary is "+sal;
	}
	public static void main(String[] args) 
	{
		B x=new B(10000);
		B y=new B(20000);
		B z=new B(30000);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);


	}
}
