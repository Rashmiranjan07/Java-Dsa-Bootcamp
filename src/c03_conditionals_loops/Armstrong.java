//Armstronng number in java
//A:- a positive integer that is equal to the sum of its own digits, each raised to the power of the total number of digits
// 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
package c03_conditionals_loops;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();

		if (isArmstrong(n)) {
			System.out.println(n + " is a Armstrong number");
		} else {
			System.out.println(n + " is not a Armstrong number");
		}

	}

	public static boolean isArmstrong(int n) {
		int count = 0;
		int sum = 0;
		int temp = n;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}

		temp = n;
		while (temp > 0) {
			int lastDigit = temp % 10;
			sum += Math.pow(lastDigit, count);
			temp /= 10;
		}

		return n == sum;

	}

}
