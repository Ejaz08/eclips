package hierarchical;

public class Cloth extends Men
{
	String name="men's zone";
	
	void brands()
	{
		System.out.println("all variety of brands are available");
	}
	public static void main(String[] args) 
	{
		Cloth c=new Cloth();
		System.out.println(c.price);
		c.details();
		System.out.println();
		System.out.println(c.cost);
		c.data();
		System.out.println();
		System.out.println(c.name);
		c.brands();
		
	}
}
