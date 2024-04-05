package hierarchical;

public class Women extends Meesho
{
int money=6000;
	
	void products()
	{
		System.out.println("women's product area");
	}
	public static void main(String[] args)
	{
		Women w=new Women();
		System.out.println(w.price);
		w.details();
		System.out.println();
		System.out.println(w.money);
		w.products();
}
}