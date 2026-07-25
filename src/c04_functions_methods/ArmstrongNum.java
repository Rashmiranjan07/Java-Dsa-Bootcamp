// Print the Armstrong number

package c04_functions_methods;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println(isArmstrong(n));
// Print all the 3 digit Armstrong numbers -
		for (int i = 100; i <= 999; i++) {
			if (isArmstrong(i)) {
				System.out.println(i + " ");
			}
		}

	}

	static boolean isArmstrong(int n) {
		int original = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			int cube = rem * rem * rem;
			sum += cube;

		}

		if (original == sum) {
			return true;
		}

		return false;

	}

}
