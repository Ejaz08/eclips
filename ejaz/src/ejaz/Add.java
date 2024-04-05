package ejaz;

public class Add 
{
static int x=134;
static int y=45;
static void m1()
{
System.out.println("m1");
}
public static void main(String[] args) 
{

//BY DIRECTLY	
System.out.println(x+y);
System.out.println(x);
System.out.println(y);

//BY Class_Name
System.out.println(Add.x);
System.out.println(Add.y);
System.out.println(Add.x+Add.y);

//BY Object_Name
Add a=new Add();
System.out.println(a.x);
System.out.println(a.y);
System.out.println(a.x+a.y);

}
}
