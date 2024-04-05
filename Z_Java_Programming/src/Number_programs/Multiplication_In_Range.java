package Number_programs;

public class Multiplication_In_Range {

	public static void main(String[] args) {

		int n = 10;
		for (int a = 1; a <= n; a++) {
			int n1 = a;
			System.out.println(a);
			for (int b = n; b <= n1; b++) {
				int mul = n1 * b;
				System.out.println(mul);

			}
		}
	}

}
