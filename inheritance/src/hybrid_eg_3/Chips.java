package hybrid_eg_3;

public class Chips extends Catagories
{
	int items=2;
	
	void pack()
	{
		System.out.println("lays"+" cheetoss");
	}
	public static void main(String[] args) 
	{
		Chips c=new Chips();
		System.out.println(c.store);
		System.out.println(c.name);
		System.out.println(c.items);
		
		c.catagories();
		c.items();
		c.pack();
	}
}
