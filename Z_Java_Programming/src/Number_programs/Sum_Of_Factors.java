package Number_programs;

import java.util.Scanner;

//wjp to get sum of the factors to the given number

public class Sum_Of_Factors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = sc.nextInt();
		int sum = 0;
		for (int a = 1; a <= n; a++) {
			if (n % a == 0) {
				sum = sum + a;
			}
			
		}
		System.out.println(sum);
	}
}
