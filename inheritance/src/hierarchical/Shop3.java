package hierarchical;

public class Shop3 extends Zomato 
{
	String s3name="efg";
	double distance=7.5;
	
	void details()
	{
		System.out.println("shop name"+":"+s3name);
	}
	void location()
	{
		System.out.println("nearby"+":"+distance+"Km");
	}
	public static void main(String[] args) 
	{
		Shop3 s3=new Shop3();
		System.out.println(s3.user);
		System.out.println(s3.mob);
		s3.login();
		s3.userdetails();
		
		System.out.println();
		
		System.out.println(s3.s3name);
		System.out.println(s3.distance);
		s3.details();
		s3.location();

}
}