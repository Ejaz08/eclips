package method;

public class H 
{
	public static void m(byte a)
	{
		System.out.println(1);
	}
	public static void m(short a)
	{
		System.out.println(2);
	}
	/*public static void m(int a)
	{
		System.out.println(3);
	}*/
	public static void m(double a)
	{
		System.out.println(4.);
	}
/*	public static void m(long a)
	{
		System.out.println(5);
	}
	public static void m(char a)
	{
		System.out.println(6);
	}*/
	/*public static void m(float a)
	{
		System.out.println(7);
	}*/
    public static void m(String a)
	{
		System.out.println(8);
	}
	public static void main(String[] args) 
	{
        H.m("hi"); 
		H.m('h'); //it will store in char 
		H.m(20);  //it will store in int
		H.m(25);  //it will store in int
		H.m(25.5);  //it will store in double
		H.m(123456789);  //it will store in int
		H.m(1.0);  //it will store in double
		H.m(2.8f); //it will store in float
		H.m(565634l); //it will store in long
}
}