package Number_programs;

import java.util.Scanner;

public class To_Find_Factors {

	// wjp to find the factors of the given number

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = sc.nextInt();

		for (int a = 1; a <= n; a++) {
			if (n % a == 0) {
				System.out.println(a);
			}
		}

	}

}
