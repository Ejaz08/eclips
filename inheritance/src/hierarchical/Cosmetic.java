package hierarchical;

public class Cosmetic extends Women
{
	String cname="lipstick";
	
	void cost()
	{
		System.out.println("2000");
	}
	public static void main(String[] args) 
	{
		Cosmetic c=new Cosmetic();
		System.out.println(c.price);
		c.details();
		System.out.println();
		System.out.println(c.money);
		c.products();
		System.out.println();
		System.out.println(c.cname);
		c.cost();

	}
}
