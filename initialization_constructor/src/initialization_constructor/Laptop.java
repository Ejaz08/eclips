package initialization_constructor;

public class Laptop 
{
	String brand;
	int cost;
	int ram;
	String processor;
	Laptop (String brand,int cost,int ram,String processor)
	{
		this.brand=brand;
		this.cost=cost;
		this.ram=ram;
		this.processor=processor;
	}
	void display()
	{
		System.out.println("brand"+": "+brand);
		System.out.println("cost"+": "+cost);
		System.out.println("ram"+": "+ram+"GB");
		System.out.println("processor"+": "+processor);
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Laptop  L1=new Laptop  ("DELL",95000,8,"i9");
		Laptop  L2=new Laptop  ("HP",32000,4,"i3");
		Laptop  L3=new Laptop  ("ASUS",59000,8,"i5");
		Laptop  L4=new Laptop  ("LENOVO",75470,16,"i5");
		
		L1.display();
		L2.display();
		L3.display();
		L4.display();
	}
}