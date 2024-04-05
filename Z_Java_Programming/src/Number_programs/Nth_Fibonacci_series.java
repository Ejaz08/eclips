package Number_programs;

//wjp to find the nth fibonacci number

public class Nth_Fibonacci_series {

	public static void main(String[] args) {

		int n = 6;
		int a = 0, b = 1;

		for (int i = 1; i < n; i++) {

			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println(a);
	}

}
