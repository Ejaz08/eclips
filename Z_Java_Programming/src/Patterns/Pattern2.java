package Patterns;

public class Pattern2 {

	public static void main(String[] args) {

		int n = 4;

		for (int a = 1; a <= n; a++) {

			for (int b = 1; b <= n; b++) {

				if (a == 1 || b == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
