package method;

public class A1 
{
	public static void add()
	 {
		A1.mul();
		System.out.println(10+20);
	 }
	 public static void sub()
     {
     	System.out.println(20-10);
     	A1.add();
     }
       public static void mul()
       {
       	A1.sub();
       	System.out.println(10*10);
       }
       public static void main(String[] args) 
       {
			A1.add();
		}
      
}
