// Calcualte Electricty bill

package c03_conditionals_loops;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter electricity units consumed: ");
		int units = sc.nextInt();

		double bill;

		if (units <= 100) {
			bill = units * 10;
		} else if (units <= 200) {
			bill = units * 15;
		} else if (units <= 300) {
			bill = units * 20;
		} else {
			bill = units * 25;
		}

		System.out.println("Electricity Bill = ₹" + bill);

	}
}