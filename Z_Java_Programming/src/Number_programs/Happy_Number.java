package Number_programs;

import java.util.Scanner;

//wjp to check whther the given number is Happy_Number or not
public class Happy_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();

		while (true) {
			int sum = 0;
			while (n > 0) {
				int d = n % 10;
				sum = sum + (d * d);
				n = n / 10;
			}
			if (sum == 1) {
				System.out.println("It is a Happy number");
				break;
			} else if (sum == 4) {
				System.out.println("It is an Unhappy Number");
				break;
			}
			n = sum;

		}

	}

}
