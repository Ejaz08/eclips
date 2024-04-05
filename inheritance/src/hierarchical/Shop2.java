package hierarchical;

public class Shop2 extends Zomato
{
	String s2name="abc";
	double distance=2.5;
	
	void details()
	{
		System.out.println("shop name"+":"+s2name);
	}
	void location()
	{
		System.out.println("nearby"+":"+distance+"Km");
	}
	public static void main(String[] args) 
	{
		Shop2 s2=new Shop2();
		System.out.println(s2.user);
		System.out.println(s2.mob);
		s2.login();
		s2.userdetails();
		
		System.out.println();
		
		System.out.println(s2.s2name);
		System.out.println(s2.distance);
		s2.details();
		s2.location();
	}
}
