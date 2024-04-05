package hierarchical;

public class Shoes extends Men
{
	int shoecost=5500;
	
	void size()
	{
		System.out.println("all sizes are available");
	}
	public static void main(String[] args) 
	{
		Shoes s=new Shoes();
		System.out.println(s.price);
		s.details();
		System.out.println();
		System.out.println(s.cost);
		s.data();
		System.out.println();
		System.out.println(s.shoecost);
		s.size();

	}
}