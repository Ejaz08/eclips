package hybrid_eg_3;

public class Catagories extends Blinkit
{
	String name="items";
	
	void items()
	{
		System.out.println("snacks");
	}
	
	public static void main(String[] args) {
		
		Catagories c= new Catagories();
		System.out.println(c.store);
		System.out.println(c.name);
		
		c.catagories();
		c.items();
	}
}
