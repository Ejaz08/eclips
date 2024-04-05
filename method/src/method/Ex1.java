package method;

public class Ex1 {
/*	public static void add ()
			
	{
		System.out.println(10+30);
	}

	public static void main(String[]args) 
	{
		System.out.println("start");
		Ex1.add();                     //classname.methodname
		System.out.println("End");
	} */
	public static void add ()
	{
		System.out.println(10+30);
	}
public static void sub ()
	{
		System.out.println(30-10);
	}
	public static void main(String[]args) 
	{
		System.out.println("start");
		Ex1.add();                     //classname.methodname
		Ex1.sub();
		System.out.println("End");
	}
}
