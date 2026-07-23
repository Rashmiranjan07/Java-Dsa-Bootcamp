//Subtract the Product and Sum of Digits of an Integer

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
