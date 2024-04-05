package hybride_eg1;

public class Electronics extends Products
{
	String second="2nd Catagory: Electronics";
	String ename="Operating System";
	int types=2;
	void type()
	{
		System.out.println(ename+":Smart phones");
	}
	void type(String ename) 
	{
		System.out.println(ename+" Laptop");
	}
	public static void main(String[] args) 
	{
		Electronics e=new Electronics();
		System.out.println(e.pname);
		System.out.println("Catagories:"+e.catagories);
		e.display();
		e.display("daily life style");
		
		System.out.println();
		
		System.out.println(e.second);
		System.out.println(e.ename);
		System.out.println("Types of System:"+e.types);
		e.type();
		e.type("Operating system:");
}
}