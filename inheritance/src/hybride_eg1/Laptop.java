package hybride_eg1;

public class Laptop extends Electronics
{
	String lname="Details of Laptop";
	String brand="Lenovo";
	int cost=65000;
	
	void version()
	{
		System.out.println("Version: windows 10");
	}
	void version(String a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Laptop b=new Laptop();
		System.out.println(b.pname);
		System.out.println("Catagories:"+b.catagories);
		b.display();
		b.display("daily life style");
		
		System.out.println();
		
		System.out.println(b.second);
		System.out.println(b.ename);
		System.out.println("Types of System:"+b.types);
		b.type();
		b.type("Operating system:");
		
		System.out.println();
		
		System.out.println(b.lname);
		System.out.println("Brand:"+b.brand);
		System.out.println("Cost:"+b.cost);
		b.version();
		b.version("Version: Windows 11");
	}
}
	
