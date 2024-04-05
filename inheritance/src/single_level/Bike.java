package single_level;

public class Bike extends Vehical
{
	String bname="Yamaha";
	int wheel=2;
	
	void bikedetails()
	{
		System.out.println("Brand"+"MT-15");
	}
	void mileage()
	{
		System.out.println("50km/mileage");
	}
	public static void main(String[] args)
	{
		Bike b=new Bike();
		System.out.println(b.vwheel);
		System.out.println(b.vname);
		b.details();
		b.seat();
		
		System.out.println(b.bname);
		System.out.println(b.wheel);
		b.bikedetails();
		b.mileage();
	}
}

