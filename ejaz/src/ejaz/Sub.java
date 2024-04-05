package ejaz;

public class Sub 
{
static int x=100;
static int y=30;
static void m1()
{
	System.out.println("m1");
}
public static void main(String[] args)
{
// BY DIRECT	
System.out.println(x-y); 

//BY CLASS_NAME
System.out.println(Sub.x-Sub.y);
System.out.println(Sub.x);
System.out.println(Sub.y);
//BY OBJECT_NAME
Sub s=new Sub();
System.out.println(s.x-s.y);
System.out.println(s.x);
System.out.println(s.y);
}
}
