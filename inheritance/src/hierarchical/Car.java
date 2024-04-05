package hierarchical;

public class Car extends Vehical
{
	int cwheel=4;
	String cname="bmw";
	
	void cardetails()
	{
		System.out.println("model-A6");
	}
	void mileage()
	{
		System.out.println("15km/mileage");
	}
	public static void main(String[] args) 
	{
		Car c=new Car();
		System.out.println(c.vwheel);
		System.out.println(c.vname);
		c.brand();
		c.seat();
		
		System.out.println(c.cwheel);
		System.out.println(c.cname);
		c.cardetails();
		c.mileage();

	}
}
