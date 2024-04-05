package hybride_eg1;

public class Shirt extends Fashion
{
	String sbrand="allen solley";
	int cost=2500;
	
	void clothing()
	{
		System.out.println("Men's Clothing");
	}
	void material()
	{
		System.out.println("Material:Pure cotton");
	}
	void size()
	{
		System.out.println("Size:small to extra large");
	}
	public static void main(String[] args) 
	{
		Shirt s=new Shirt();
		System.out.println(s.pname);
		System.out.println("Catagories:"+s.catagories);
		s.display();
		s.display("daily life style");
		
		System.out.println();
		System.out.println(s.first);
		System.out.println(s.fname);
		System.out.println("Types of clothing:"+s.types);
		s.type();
		s.type("Women's");
		
		System.out.println();
		
		System.out.println("Brand:"+s.sbrand);
		System.out.println("Cost:"+s.cost);
		s.clothing();
		s.material();
		s.size();
	}
}
