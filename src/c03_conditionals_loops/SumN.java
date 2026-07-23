//Sum Of N Numbers

package c03_conditionals_loops;

import java.util.Scanner;

public class SumN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers do you want to add? ");
		int n = sc.nextInt();

		int sum = 0;

		System.out.println("Enter " + n + " numbers:");

		for (int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			sum += num;
		}

		System.out.println("Sum = " + sum);
	}

}
