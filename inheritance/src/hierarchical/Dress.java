package hierarchical;

public class Dress extends Women
{
String dname="saree";
	
	void value()
	{
		System.out.println("8000");
	}
	public static void main(String[] args) 
	{
		Dress d=new Dress();
		System.out.println(d.price);
		d.details();
		System.out.println();
		System.out.println(d.money);
		d.products();
		System.out.println();
		System.out.println(d.dname);
		d.value();

}
}