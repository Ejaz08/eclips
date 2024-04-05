package static_calling;

public class Laptop 
{
	static int ram=4;
	static double cost=10000.0;
	static String name="HP";
	
	public static void main(String[] args) 
	{
		System.out.println("START");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println(Laptop.ram);
		System.out.println(Laptop.cost);
		System.out.println(Laptop.name);
	}
}
