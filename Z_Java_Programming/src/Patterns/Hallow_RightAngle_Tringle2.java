package Patterns;

import java.util.Scanner;

public class Hallow_RightAngle_Tringle2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter For n value");
		int n = sc.nextInt();

		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (b == 1 || a == 1 || a+b == n+1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
