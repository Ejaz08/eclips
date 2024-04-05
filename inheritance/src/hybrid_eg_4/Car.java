package hybrid_eg_4;

public class Car extends Store
{
	String brand1="honda";
	String brand2="jaguar";
	
	void brand()
	{
		System.out.println("display the brand of cars");
	}
	public static void main(String[] args) {
		
		Car c=new Car();
		
		System.out.println(c.item1);
		System.out.println(c.item2);
		c.details();
		
		System.out.println(c.brand1);
		System.out.println(c.brand2);
		c.brand();
	}
}
