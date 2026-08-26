package c09_patterns;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
//		pattern2(4);
//		pattern1(5);
//		pattern3(4);
//		pattern4(5);
//		pattern5(5);
//		pattern6(5);
//		pattern7(5);
//		pattern8(5);
//		pattern9(5);
//		pattern10(5);
//		pattern11(5);
//		pattern12(5);
//		pattern13(5);
//		pattern14(5);
//		pattern15(5);
		pattern17(5);

	}

	static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println(" ");

		}
	}

	static void pattern2(int n) {
		for (int row = 1; row <= n; row++) {
			// for every row, run the col
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			// when one row is printed, we need to add a newline
			System.out.println();
		}
	}

	static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print(col);

			}
			// when one row is printed, we need to add a newline
			System.out.println();
		}
	}

	static void pattern5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i >= j && i + j <= n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void pattern6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j && i + j <= n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void pattern7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void pattern8(int n) {
		for (int i = 0; i < n; i++) {

			// spaces
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	static void pattern9(int n) {
		for (int i = 0; i < n; i++) {

			// spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 0; j < 2 * (n - i) - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	static void pattern10(int n) {
		for (int i = 0; i < n; i++) {

			// spaces
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	static void pattern11(int n) {
		for (int i = 0; i < n; i++) {

			// spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	static void pattern12(int n) {

		// decreasing
		for (int i = 0; i < n; i++) {

			// spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		// increasing
		for (int i = 0; i < n; i++) {

			// spaces
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	static void pattern13(int n) {
		for (int i = 0; i < n; i++) {

			// spaces before the pyramid
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// stars / inside spaces
			for (int j = 0; j < 2 * i + 1; j++) {

				// first star, last star, or last row
				if (j == 0 || j == 2 * i || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

	static void pattern14(int n) {
		for (int i = 0; i < n; i++) {

			// spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// stars and inner spaces
			for (int j = 0; j < 2 * (n - i) - 1; j++) {

				if (i == 0 || j == 0 || j == 2 * (n - i) - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	static void pattern15(int n) {

		// Upper half
		for (int i = 0; i < n; i++) {

			// spaces
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// stars and inner spaces
			for (int j = 0; j < 2 * i + 1; j++) {

				if (j == 0 || j == 2 * i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		// Lower half
		for (int i = n - 2; i >= 0; i--) {

			// spaces
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// stars and inner spaces
			for (int j = 0; j < 2 * i + 1; j++) {

				if (j == 0 || j == 2 * i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	static void pattern16(int n) {

		for (int i = 0; i < n; i++) {

			// spaces
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}

			int value = 1;

			for (int j = 0; j <= i; j++) {

				System.out.print(value + "   ");

				// calculate next value
				value = value * (i - j) / (j + 1);
			}

			System.out.println();
		}
	}

	static void pattern17(int n) {
		for (int row = 1; row <= 2 * n; row++) {

			int c = row > n ? 2 * n - row : row;

			for (int space = 0; space < n - c; space++) {
				System.out.print("  ");
			}

			for (int col = c; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for (int col = 2; col <= c; col++) {
				System.out.print(col + " ");
			}

			System.out.println();
		}
	}
}
