//Write a function that returns the sum of first n natural numbers.

package c04_functions_methods;

import java.util.Scanner;

public class NaturalNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int sum = sumNatural(n);

		System.out.println("Sum of first " + n + " natural numbers = " + sum);

		sc.close();
	}

	static int sumNatural(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		return sum;
	}

}
