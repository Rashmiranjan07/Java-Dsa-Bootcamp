//Calculate CGPA Java Program

package c03_conditionals_loops;

import java.util.Scanner;

public class CgpaCalculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of semesters: ");
		int n = sc.nextInt();

		double total = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("Enter SGPA of Semester " + i + ": ");
			double sgpa = sc.nextDouble();
			total += sgpa;
		}

		double cgpa = total / n;

		System.out.printf("Your CGPA is: %.2f", cgpa);

	}

}
