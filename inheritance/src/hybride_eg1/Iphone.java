package hybride_eg1;

public class Iphone extends SmartPhone
{
	String group1="Group One: IPHONE";
	String model="Iphone 13";
	int MRP=60000;
	
	void details1()
	{
		System.out.println(model+":IOS Version");
	}
	void details1(int a)
	{
		System.out.println("RAM :"+a+" GB");
	}
	public static void main(String[] args) 
	{
		Iphone i=new Iphone();
		System.out.println(i.pname);
		System.out.println("Catagories:"+i.catagories);
		i.display();
		i.display("daily life style");
		
		System.out.println();
		
		System.out.println(i.second);
		System.out.println(i.ename);
		System.out.println("Types of System:"+i.types);
		i.type();
		i.type("Operating system:");
		
		System.out.println();
		
		System.out.println(i.group1);
		System.out.println("Model:"+i.model);
		System.out.println("MRP Rs-"+i.MRP);
		i.details1();
		i.details1(6);
		
	}
}
