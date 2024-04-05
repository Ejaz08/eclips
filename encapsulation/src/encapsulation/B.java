package encapsulation;

public class B extends A
{
public static void main(String[] args) 
{
	B b=new B();
	System.out.println(b.get());
	
	b.set(20);
	System.out.println(b.get());
	
	b.set(30);
	System.out.println(b.get());
}
}

