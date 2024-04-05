package both_Satic_And_Non_Static;

public class Details 
{
	static String name="RAHUL";
	static int age=25;
	       String College="GITA college";
	       int roll= 194008;
	       int mob=678767889;
	       
	       public static void main(String[] args) 
	    {
	    	 

			System.out.println(Details.name);
			System.out.println(Details.age);
			 
			Details d=new Details();
			System.out.println(d.College);
			System.out.println(d.roll);
			System.out.println(d.mob);
			
					}
}
