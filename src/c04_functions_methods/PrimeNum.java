//Write a function that returns all prime numbers between two given numbers.

package c04_functions_methods;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number:");
		int x = sc.nextInt();
		System.out.println("Enter another  number:");
		int y = sc.nextInt();

		System.out.println("Prime numbers between " + x + " and " + y + " are:");

		for (int i = x; i <= y; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
