package ejaz;

public class Multi 
{
static int a=123;
static int b=2;
static void main()
{
	System.out.println("main");
}
public static void main(String[] args) 
{
	//BY directly
	System.out.println(a*b);
	System.out.println(a);
	System.out.println(b);
	
	//By Class_Name
	System.out.println(Multi.a);
	System.out.println(Multi.b);
	System.out.println(Multi.a*Multi.b);
	
	//By Object_Name
	Multi m=new Multi();
	
	System.out.println(m.a);
	System.out.println(m.b);
	System.out.println(m.a*m.b);
	
}
}
