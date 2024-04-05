package Number_programs;

import java.util.Scanner;

//wjp to print prime number into a range

public class PrimeNumber_Bet_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}
