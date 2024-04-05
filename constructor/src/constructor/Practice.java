package constructor;

public class Practice 
{
	int a;
	Practice (int a)
	{
		this.a=a;
	}
	public static void main(String[] args) 
	{
		
		Practice p= new Practice(20);
		Practice p1=new Practice (27);
		System.out.println(p.a);
		System.out.println(p1.a);
	}
}
