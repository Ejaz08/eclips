package Number_programs;

import java.util.Scanner;

//wjp to check whether the given number is Auto_Morphic_Number or not

public class Auto_Morphic_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");

		int n = sc.nextInt();
		int sq = n * n;

		while (n > 0) {
			if (n % 10 == sq % 10) {

				n = n / 10;
				sq = sq / 10;
			}
			else {
				break;
			}
		}
		if(n==0) {
			System.out.println("It is an auto morphic number");
		}
		else {
			System.out.println("It is not an Auto Morphic number");
		}

	}

}
