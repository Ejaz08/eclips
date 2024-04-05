package Patterns;

import java.util.Scanner;

public class Hallow_square {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter For n value");
		int n = sc.nextInt();
		
		for(int a= 1;a<=n;a++) {
			for(int b=1;b<=n;b++) {
				if(a==1 || b==1 || a==n || b==n	) {
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
