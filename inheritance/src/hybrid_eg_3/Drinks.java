package hybrid_eg_3;

public class Drinks extends Catagories
{
	int no=5;
	
	void brands()
	{
		System.out.println("thumps up"+" 7up"+" cocacola");
	}
	public static void main(String[] args) {
		
		Drinks d= new Drinks();
		System.out.println(d.store);
		System.out.println(d.name);
		System.out.println(d.no);
		
		d.catagories();
		d.items();
		d.brands();
	}
}
