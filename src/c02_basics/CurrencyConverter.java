//Input currency in rupees and output in USD.
package c02_basics;

import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount in Rupees (INR): ");
		double rupee = sc.nextInt();

		double USD = rupee * 0.010;
		System.out.println("Amount in USD : "+ USD);

	}
}
