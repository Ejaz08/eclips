package hybride_eg1;

public class Vivo extends SmartPhone
{
	String group2="Group Two: VIVO";
	String model="Vivo Z1x";
	int MRP=20000;
	
	void details2()
	{
		System.out.println(model+":Android Version");
	}
	void details2(int a)
	{
		System.out.println("RAM :"+a+" GB");
	}
	public static void main(String[] args) 
	{
		Vivo v=new Vivo();
		System.out.println(v.pname);
		System.out.println("Catagories:"+v.catagories);
		v.display();
		v.display("daily life style");
		
		System.out.println();
		
		System.out.println(v.second);
		System.out.println(v.ename);
		System.out.println("Types of System:"+v.types);
		v.type();
		v.type("Operating system:");
		
		System.out.println();
		
		System.out.println(v.group2);
		System.out.println("Model:"+v.model);
		System.out.println("MRP Rs-"+v.MRP);
		v.details2();
		v.details2(4);
		
	}
}
