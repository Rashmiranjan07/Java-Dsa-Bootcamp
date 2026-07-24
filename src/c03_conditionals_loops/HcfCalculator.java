//HCF Of Two Numbers Program

package c03_conditionals_loops;

import java.util.Scanner;

public class HcfCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();

		System.out.println("Enter second number: ");
		int b = sc.nextInt();

		int hcf = 1;

		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;

			}
		}
		System.out.println(hcf);
	}
}
