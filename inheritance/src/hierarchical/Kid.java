package hierarchical;

public class Kid extends Meesho
{
int value=1000;
	
	void display()
	{
		System.out.println("kid's product area");
	}
	public static void main(String[] args)
	{
		Kid k=new Kid();
		System.out.println(k.price);
		k.details();
		System.out.println();
		System.out.println(k.value);
		k.display();
}
}