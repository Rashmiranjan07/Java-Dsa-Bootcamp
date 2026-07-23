//Calculate Commission Percentage

package c03_conditionals_loops;

import java.util.Scanner;

public class CommissionCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Sales Amount: ");
		double sales = sc.nextDouble();

		System.out.print("Enter Commission Percentage: ");
		double commissionPercent = sc.nextDouble();

		double commission = (sales * commissionPercent) / 100;

		System.out.println("Commission Amount = " + commission);
	}

}
