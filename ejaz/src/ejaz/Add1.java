package ejaz;

public class Add1 
{
 int a=12;
 int b=13;
 static void add()
{
System.out.println(10+20);
}
public static void main(String[] args) 
{
 //	System.out.println(a+b); //direct calling
//	System.out.println(Add1.a+Add1.b);
	
	Add1 x=new Add1();
	System.out.println(x.b);
	System.out.println(x.a);
	System.out.println(x.a+x.b);
	x.add();
			
}
}
