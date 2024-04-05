package Number_programs;

//wjp to check whether the given number is prime number or not

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 5;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("is a prime number");
		} else {
			System.out.println("is not a prime number");
		}

	}

}
