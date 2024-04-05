package hybrid_eg_4;

public class bike extends Store
{
	String brand1="Bmw";
	String brand2="sukuzi";
	
	void display()
	{
		System.out.println("details of brands");
	}
	public static void main(String[] args) {
		bike b= new bike();
		
		System.out.println(b.item1);
		System.out.println(b.item2);
		b.details();
		
		System.out.println(b.brand1);
		System.out.println(b.brand2);
		b.display();
	}
	
}
