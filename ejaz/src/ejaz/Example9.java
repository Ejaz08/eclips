package ejaz;

public class Example9 {

	public static void main(String[] args) 
	{
		//swapping two numbers
		int a=10;
		int b=20;
		
		System.out.println("a is" +a+ "b is"+b);
		
		b = b + a; // now b is sum of both the numbers
		a = b - a; // b - a = (b + a) - a = b (a is swapped)
		b = b - a; // (b + a) - b = a (b is swapped)
		
		System.out.println("a is" +a+ "b is"+b);

	}

}
