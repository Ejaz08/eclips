package Number_programs;

import java.util.Scanner;

public class Neon_number {

	// wjp whether the given number is neon number is or not

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");

		int n = sc.nextInt();
		int sq = n * n, sum = 0;

		while (sq > 0) {

			int d = sq % 10;
			sum = sum + d;
			sq = sq / 10;
		}
		if (sum == n) {
			System.out.println("It is a Neon Number");
		} else {
			System.out.println("It is not a Neon Number");
		}
	}

}
