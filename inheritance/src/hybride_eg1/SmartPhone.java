package hybride_eg1;

public class SmartPhone extends Electronics
{
	String name="Smart Phone";
	int groups=2;
	
	void group()
	{
		System.out.println(name+":Iphone");
	}
	void group(String mob)
	{
		System.out.println(name+":"+mob);
	}
	public static void main(String[] args) 
	{
		SmartPhone s=new SmartPhone();
		System.out.println(s.pname);
		System.out.println("Catagories:"+s.catagories);
		s.display();
		s.display("daily life style");
		
		System.out.println();
		
		System.out.println(s.second);
		System.out.println(s.ename);
		System.out.println("Types of System:"+s.types);
		s.type();
		s.type("Operating system:");
		
		System.out.println();
		
		System.out.println("Details of "+s.name);
		System.out.println("Divided into:"+s.groups+" groups");
		s.group();
		s.group("Vivo");
}
}