package initialization_constructor;

public class Product 
{
	String brand;
	int cost;
	String material;
	String size;
	
	Product(String brand,int cost,String material,String size)
	{
		this.brand=brand;
		this.cost=cost;
		this.material=material;
		this.size=size;
	}
	void details()
	{
		System.out.println("brand"+": "+brand);
		System.out.println("cost"+": "+cost);
		System.out.println("material"+": "+material);
		System.out.println("size"+": "+size);
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Product P1=new Product("ALLEN SOLLY",4599,"COTTON","MEDIUM");
		Product P2=new Product("TURTUL",3999,"100% PURE COTTON","LARGE");
		Product P3=new Product("DENIN",2599,"DENIN COTTON","SMALL");
		Product P4=new Product("RAYMOND",3599,"COTTON","EXTRA LARGE");
		Product P5=new Product("LOUIS PHILIPPES",5599,"COTTON","MEDIUM");
		Product P6=new Product("LEVIS",2999,"COTTON","MEDIUM");
		Product P7=new Product("HRX",3999,"SILK","EXTRA MEDIUM");
		Product P8=new Product("KILLER",2999,"BLEND COTTON","SMALL");
		Product P9=new Product("ARMANI",7599,"PURE COTTON","MEDIUM");
		Product P10=new Product("US POLO",1499,"COTTON","LARGE");
		
		P1.details();
		P2.details();
		P3.details();
		P4.details();
		P5.details();
		P6.details();
		P7.details();
		P8.details();
		P9.details();
		P10.details();







	}
}
