package hierarchical;

public class Shop1 extends Zomato
{
	String s1name="xyz";
	double distance=4.5;
	
	void details()
	{
		System.out.println("shop name"+":"+s1name);
	}
	void location()
	{
		System.out.println("nearby"+":"+distance+"Km");
	}
	public static void main(String[] args) 
	{
		Shop1 s1=new Shop1();
		System.out.println(s1.user);
		System.out.println(s1.mob);
		s1.login();
		s1.userdetails();
		
		System.out.println();
		
		System.out.println(s1.s1name);
		System.out.println(s1.distance);
		s1.details();
		s1.location();
		
		
	}
}
