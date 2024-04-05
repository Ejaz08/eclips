package static_calling;

public class B 
{
	static int age=18;
	static double sal=30000;
	static int id=3;
	
	static void details()
	{
		String name="rahul";
		System.out.println("name :"+name);
	}
	public static void main(String[] args) 
	{
		B.details();
		System.out.println(B.age);
		System.out.println(B.sal);
		System.out.println(B.id);
	}
}
