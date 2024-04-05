package static_calling;

public class Operation 
{
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	static void mul(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	static void div(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Operation.add(23, 2);
		Operation.mul(10, 2);
		Operation.div(10, 2);
		
	}
	
}
