package Number_programs;

public class Perfect_Number {

	public static void main(String[] args) {
		int n = 28, sum = 0;
		for (int a = 1; a < n; a++) {
			if (n % a == 0) {
				sum = sum + a;
			}

		}
		if (n == sum) {
			System.out.println("It is a perfect Number");
		} else {
			System.out.println("It is not a perfect number");
		}
	}

}
