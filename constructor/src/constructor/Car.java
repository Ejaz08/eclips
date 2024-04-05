package constructor;

public class Car 
{
	static String col="Black";
	static String model="A6";
	       String wheel= "alloy";
	       String light= "LED white";
	       
	       
	       static void brand()
	       {
	    	   System.out.println("BMW");
	       }
	       void driving()
	       {
	    	   System.out.println("automatic");
	       }
   public static void main(String[] args) 
	  {
			System.out.println(Car.col);
			System.out.println(Car.model);
			Car.brand();
			
			Car C=new Car();
			System.out.println(C.wheel);
			System.out.println(C.light);
			C.driving();
					
	  }
}