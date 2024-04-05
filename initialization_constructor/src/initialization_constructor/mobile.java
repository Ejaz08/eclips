package initialization_constructor;

public class mobile 
{
	String brand;
	int cost;
	int ram;
	String processor;
	boolean bluetooth;
	int rom;
	boolean wifi;
	String support;
	
mobile(String brand, int cost, int ram, String processor, boolean bluetooth, int rom, boolean wifi,String support) 
    {	
		this.brand = brand;
		this.cost = cost;
		this.ram = ram;
		this.processor = processor;
		this.bluetooth = bluetooth;
		this.rom = rom;
		this.wifi = wifi;
		this.support=support;
	}
void display()
{
	System.out.println("brand"+": "+brand);
	System.out.println("cost"+": "+cost);
	System.out.println("ram"+": "+ram+"GB");
	System.out.println("processor"+": "+processor);
	System.out.println("bluetooth"+": "+bluetooth);
	System.out.println("rom"+": "+rom+"GB");
	System.out.println("wifi"+": "+wifi);
	System.out.println("support"+": "+support);
	
	System.out.println();
}
public static void main(String[] args) 
{
	mobile  M1=new mobile ("IPHONE",65000,8,"iOS",true,128,true,"5G");
	mobile  M2=new mobile ("VIVO",25000,6,"snapdragon 720",true,64,true,"4G");
	mobile  M3=new mobile ("SAMSUNG",72000,8,"snapdragon 872",true,256,true,"5G");
	mobile  M4=new mobile ("LAVA",5000,2,"jellybeam",true,16,false,"3G");
	mobile  M5=new mobile ("NOKIA",2999,0,"OLD VERSION",false,1,false,"2G");

	M1.display();
	M2.display();
	M3.display();
	M4.display();
	M5.display();
}

	
}

