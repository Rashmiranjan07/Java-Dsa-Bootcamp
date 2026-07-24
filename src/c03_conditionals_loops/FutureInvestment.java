//Future Investment Value

package c03_conditionals_loops;

import java.util.Scanner;

public class FutureInvestment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();

		System.out.print("Enter annual interest rate (%): ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter number of years: ");
		int years = input.nextInt();

		double monthlyInterestRate = annualInterestRate / 100 / 12;

		double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

		System.out.printf("Future Investment Value = %.2f%n", futureValue);

	}

}
