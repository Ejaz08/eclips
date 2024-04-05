package while_loop_e.x;

import java.util.Scanner;

public class partten {

	public static void partten1() {
		int n = 4;

		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (a == 1 || b == n || a == n || b == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

	public static void partten2() {
		int n = 5;
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (a == b || a + b == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	public static void partten3() {
		int n = 5;
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (b == 1 || a == n || a == b) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

	public static void partten4() {
		int n = 5;
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (a == n || b == n || a + b == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	public static void partten5() {
		int n = 4;
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (b % 2 == 1) {
					System.out.print(b + " ");
				} else {
					System.out.print(a + " ");
				}

			}
			System.out.println();
		}
	}

	public static void partten6() {
		int n = 4;
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (a % 2 == 1) {
					System.out.print(a + " ");
				} else {
					System.out.print(b + " ");
				}

			}
			System.out.println();
		}
	}

	public static void partten7() {
		int n=4;
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (b % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value Of N");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("enter The Number Of Partten");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:partten.partten1();
			break;
			case 2:partten.partten2();
			break;	
			case 3:partten.partten3();
			break;
			case 4:partten.partten4();
			break;	
			case 5:partten.partten5();
			break;
			case 6:partten.partten7();
			break;
			case 7:partten.partten7();
			break;
			case 8:partten.partten2();
			break;	
			case 9:partten.partten1();
			break;
			case 10:partten.partten2();
			break;
			}
		}
	}
}
