package initialization_constructor;
//wajp to create a class name emp and have three atributes string name,double sal,emp id
//initailize those with parameteised con and this keyword .create a main method and have 4 emp objects and fetch all the details.

public class Emp 
{
	int empid;
	String name;
	double sal;
	
	Emp(int empid,String name,double sal)
	{
		this.empid=empid;
		this.name=name;
		this.sal=sal;
	}	
		void details()
		{
			System.out.println(empid+"  "+name+"  "+sal);
		}
	
	public static void main(String[] args) 
	{
		Emp e=new Emp(1,"rahul",600.11);
		Emp e1=new Emp(2,"sham",700.11);
		Emp e2=new Emp(3,"ejaz",800.11);
		Emp e3=new Emp(4,"ahmed",900.44);
		
		
	/*	System.out.println(e.empid+" "+e.name+" "+e.sal);
		System.out.println(e1.empid+" "+e1.name+" "+e1.sal);
		System.out.println(e2.empid+" "+e2.name+" "+e2.sal);
		System.out.println(e3.empid+" "+e3.name+" "+e3.sal); */
		
	e.details();
	e1.details();
	e2.details();
	e3.details();
	
		
}
}