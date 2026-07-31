//Subtract the Product and Sum of Digits of an Integer
/*
 Given an integer number n, return the difference between the product of its digits and the sum of its digits.
Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 */
package c03_conditionals_loops;

import java.util.Scanner;

public class SubtractProductAndSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		int rem = 0;
		int sum = 0;
		int sub = 0;
		int product = 0;

		while (n > 0) {
			rem = n % 10;
			sum = sum + rem;
			product = product * rem;
			n = n / 10;
		}
		int result = product - sum;

		System.out.println("The sum of digit is : " + sum);
		System.out.println("The sum of digit is : " + product);
		System.out.println("The Result is : " + result);

	}

}
