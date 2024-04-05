package constructor;

public class Eg 
{
	int a=10;
	int b=20;

	public void add()
	{
		System.out.println(10+20);
	}
	
	public static void main(String[] args) 
	{
		Eg A=new Eg();
		System.out.println(A.a);
		System.out.println(A.b);
		A.add();
		
}
}