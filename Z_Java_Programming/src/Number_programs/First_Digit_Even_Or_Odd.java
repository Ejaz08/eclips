package Number_programs;

import java.util.Scanner;

public class First_Digit_Even_Or_Odd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int rev = 0;
		while (n > 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		System.out.println(rev);
		int f =rev%10;
		if(f%2==0) {
			System.out.println("It is a even number");
		}
		else {
			System.out.println("it is odd number");
		}

	}

}
