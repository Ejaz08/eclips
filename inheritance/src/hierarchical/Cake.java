 package hierarchical;

public class Cake extends Shop3
{
	String cname="chocolate cake";
	int a=550;
	void cost()
	{
		System.out.println("cost"+":"+a);
	}
	public static void main(String[] args) 
	{
		Cake c=new Cake();
		System.out.println(c.user);
		System.out.println(c.mob);
		c.login();
		c.userdetails();
		
		System.out.println();
		
		System.out.println(c.s3name);
		System.out.println(c.distance);
		c.details();
		c.location();
		
		System.out.println();
		
		System.out.println(c.cname);
		c.cost();
}
}
