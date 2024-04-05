package Number_programs;

//wjp to swap without using 3rd variable

public class Swap_Number_WithoutUsing_Variable {

	public static void main(String[] args) {
		
		int a=15;
		int b=10;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
