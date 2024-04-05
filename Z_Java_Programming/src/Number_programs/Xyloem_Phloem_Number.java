package Number_programs;

import java.util.Scanner;

public class Xyloem_Phloem_Number {

	// wjp to check the given number is xylum number or phloem number

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int l = n % 10;
		n = n / 10;

		int innersum = 0;
		while (n > 9) {
			int d = n % 10;
			innersum=innersum+d;
			n = n / 10;
		}
		int outersum = n + l;
		if (innersum == outersum) {
			System.out.println("It is a xyleom number");

		} else {
			System.out.println("It is a Phloem Number");
		}
	}

}
