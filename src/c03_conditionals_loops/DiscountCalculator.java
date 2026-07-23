//Calculate Discount Of Product

package c03_conditionals_loops;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of the product: ");
		double price = sc.nextDouble();

		System.out.println("Enter the discount percentage : ");
		double discount = sc.nextDouble();

		double discountAmount = (price * discount) / 100;
		double finalPrice = price - discountAmount;

		System.out.println("Discount Amount: " + discountAmount);
		System.out.println("Final Price: " + finalPrice);

	}

}
