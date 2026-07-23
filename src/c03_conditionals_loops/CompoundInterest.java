//Compound Interest Java Program

package c03_conditionals_loops;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the principal amount: ");
		double principal = scanner.nextDouble();

		System.out.print("Enter the annual interest rate (in %): ");
		double annualRate = scanner.nextDouble();

		System.out.print("Enter the time period (in years): ");
		double time = scanner.nextDouble();

		System.out.print("Enter the number of times interest is compounded per year: ");
		int compoundingFrequency = scanner.nextInt();

		double rateInDecimal = annualRate / 100;

		double totalAmount = principal
				* Math.pow(1 + (rateInDecimal / compoundingFrequency), compoundingFrequency * time);

		double compoundInterest = totalAmount - principal;

		System.out.println("\n--- Financial Summary ---");
		System.out.printf("Initial Principal: $%.2f\n", principal);
		System.out.printf("Total Interest Earned: $%.2f\n", compoundInterest);
		System.out.printf("Final Total Balance: $%.2f\n", totalAmount);
	}

}
