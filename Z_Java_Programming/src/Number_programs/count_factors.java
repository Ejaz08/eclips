package Number_programs;

import java.util.Scanner;

public class count_factors {

	// wjp to count the factors to a given number

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = sc.nextInt();
		int count = 0;
		for (int a = 1; a <= n; a++) {

			if (n % a == 0) {
				System.out.println(a);
				count++;
			}

		}
		System.out.println("**********");
		System.out.println("Number of counts: " + count);
	}
}
