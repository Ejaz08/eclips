package constructor;

public class Bike 
{
	static String col="Black";
	static String model="G10R";
	       String wheel= "alloy";
	       String light= "LED white";
	       
	       
	       static void brand()
	       {
	    	   System.out.println("BMW");
	       }
	       void pistonbreak()
	       {
	    	   System.out.println("ABS");
	       }
   public static void main(String[] args) 
	  {
			System.out.println(Bike.col);
			System.out.println(Bike.model);
			Bike.brand();
			
			Bike B=new Bike();
			System.out.println(B.wheel);
			System.out.println(B.light);
			B.pistonbreak();
}
}