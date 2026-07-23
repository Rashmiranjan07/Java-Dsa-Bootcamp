package c03_conditionals_loops;

import java.util.Scanner;

public class FindNcrnpr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		System.out.print("Enter r: ");
		int r = sc.nextInt();

		int factN = 1;
		int factR = 1;
		int factNR = 1;

		// n!
		for (int i = 1; i <= n; i++) {
			factN *= i;
		}

		// r!
		for (int i = 1; i <= r; i++) {
			factR *= i;
		}

		// (n-r)!
		for (int i = 1; i <= (n - r); i++) {
			factNR *= i;
		}

		int nPr = factN / factNR;
		int nCr = factN / (factR * factNR);

		System.out.println("nPr = " + nPr);
		System.out.println("nCr = " + nCr);

		sc.close();
	}
}
