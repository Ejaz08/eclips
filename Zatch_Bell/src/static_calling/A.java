package static_calling;


public class A
{	
	static int a= 10;
	static double b=20;
		
	public static void main(String[] args) 
		{
			int a=30;
			System.out.println(a);
			System.out.println(A.a);
			System.out.println(A.b);
		}
	
}
