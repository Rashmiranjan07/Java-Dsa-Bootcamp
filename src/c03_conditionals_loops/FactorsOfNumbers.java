//Input a number and print all the factors of that number (use loops).

package c03_conditionals_loops;

import java.util.Scanner;

public class FactorsOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		isFactor(n);
	}

	public static void isFactor(int n) {
		for (int i = 1; i <= 12; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}
}
