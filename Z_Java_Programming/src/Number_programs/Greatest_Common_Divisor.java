package Number_programs;

import java.util.Scanner;

public class Greatest_Common_Divisor {

	// wjp to find gcd in between to number

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the !st number");
		int n = sc.nextInt();

		System.out.println("Enter the 2nd Number");
		int n1 = sc.nextInt();
		int gcd = 0;
		for (int a = 1; a <= n && a <= n1; a++) {

			if (n % a == 0 && n1 % a == 0) {
				gcd = a;
			}
		}
		System.out.println(gcd);

	}

}
