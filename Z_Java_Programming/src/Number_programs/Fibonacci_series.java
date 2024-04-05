package Number_programs;

//wjp to print Fibonacci_series

public class Fibonacci_series {

	public static void main(String[] args) {

		int n = 6;
		int a = 0, b = 1;

		for (int i = 1; i <= n; i++) {

			System.out.println(a);

			int c = a + b;
			a = b;
			b = c;
		}
	}

}
