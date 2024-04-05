package hierarchical;

public class Shop4 extends Zomato
{
	String s4name="qrs";
	double distance=1.5;
	
	void details()
	{
		System.out.println("shop name"+":"+s4name);
	}
	void location()
	{
		System.out.println("nearby"+":"+distance+"Km");
	}
	public static void main(String[] args) 
	{
		Shop4 s4=new Shop4();
		System.out.println(s4.user);
		System.out.println(s4.mob);
		s4.login();
		s4.userdetails();
		
		System.out.println();
		
		System.out.println(s4.s4name);
		System.out.println(s4.distance);
		s4.details();
		s4.location();
	}
}
