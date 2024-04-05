package ejaz;

public class Addition 
{
static int x=10;
static int y=20;
static void m1()
{
System.out.println("m1 method of class addition");	
}
void m2 ()
{
	System.out.println("m2 method of class addition");
}
public static void main(String[] args) 
{ 
	//Direct method 
	System.out.println(x);  
	System.out.println(y);
	System.out.println(x+y);
	
	// By Class_Name
	System.out.println(Addition.x);   
	System.out.println(Addition.y);  
    
	Addition.m1();
	//Addition.m2();  //ERROR
	
	// By Object_Name
	Addition a=new Addition();
	System.out.println(a.x);
	System.out.println(a.y);
	
	a.m1();
	a.m2();
		
}
}


