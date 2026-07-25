//Write a function to find if a number is a palindrome or not. Take number as parameter.

package c04_functions_methods;

import java.util.Scanner;

public class PalindromeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		boolean Palindrome = isPalindrome(n);
		System.out.println(Palindrome);

	}

	static boolean isPalindrome(int n) {
		int original = n;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}

		return original == rev;

	}

}
