package Number_programs;

//wjp to swap two variables by using 3rd variable

public class Swaping_Number {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("a=" + a + " (Before swapping)");
		System.out.println("b=" + b + " (Before swapping)");
		System.out.println();
		
		int c = a;
		a = b;
		b = c;

		System.out.println("a=" + a + " (After swapping)");
		System.out.println("b=" + b + " (After Swapping)");

	}

}
