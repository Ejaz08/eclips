package hierarchical;

public class Men extends Meesho
{
	int cost=6000;
	
	void data()
	{
		System.out.println("men's product area");
	}
	public static void main(String[] args)
	{
		Men m=new Men();
		System.out.println(m.price);
		m.details();
		System.out.println();
		System.out.println(m.cost);
		m.data();
		
	}
}
