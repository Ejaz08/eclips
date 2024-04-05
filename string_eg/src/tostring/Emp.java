package tostring;

public class Emp 
{
	String name;
	int id;
	int sal;
	int mob;
	
	Emp(String name,int id,int sal,int mob)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.mob=mob;
	}
	public String toString()
	{
		return "details "+name+"-"+id+"-"+sal+"-"+mob;
	}
	
	public static void main(String[] args)
	{
		Emp a=new Emp("rahul",1,500000,70776333);
		Emp a1=new Emp("karan",2,6000,997766733);
		Emp a2=new Emp("ejaz",3,7000,667765633);
		Emp a3=new Emp("raja",4,8000,88776983);
		Emp a4=new Emp("chiku",5,9000,70776222);
		
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);

	}
}
