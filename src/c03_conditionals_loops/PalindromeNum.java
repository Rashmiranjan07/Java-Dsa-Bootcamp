//Find if a number is palindrome or not
//Palindrome = any integer that remains the same when its digits are reversed
package c03_conditionals_loops;

import java.util.Scanner;

public class PalindromeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		int rem = 0;
		while (temp > 0) {
			rem = temp % 10;
			rev = (rev * 10) + rem;
			temp = temp / 10;
		}

		temp = n;

		if (n == rev) {
			System.out.println("it is a palindrome " + n);
		} else {
			System.out.println("it is not a palindrome " + n);
		}

	}

}
