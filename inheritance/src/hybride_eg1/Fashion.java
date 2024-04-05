package hybride_eg1;

public class Fashion extends Products
{
	String first="1st Catagory: Fashion";
	String fname="clothing";
	int types=2;
	void type()
	{
		System.out.println("Men's "+fname);
	}
	void type(String fname) 
	{
		System.out.println(fname+" Clothing");
	}
	public static void main(String[] args) 
	{
		Fashion f=new Fashion();
		System.out.println(f.pname);
		System.out.println("Catagories:"+f.catagories);
		f.display();
		f.display("daily life style");
		
		System.out.println();
		
		System.out.println(f.first);
		System.out.println(f.fname);
		System.out.println("Types of clothing:"+f.types);
		f.type();
		f.type("Women's");
	}
}
