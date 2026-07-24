//Calulate the Depreciation of value

package c03_conditionals_loops;

import java.util.Scanner;

public class DepreciationValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Original Value: ");
		double originalValue = sc.nextDouble();

		System.out.print("Enter Depreciation Percentage: ");
		double depreciationPercent = sc.nextDouble();

		double depreciationAmount = (originalValue * depreciationPercent) / 100;

		
		double finalValue = originalValue - depreciationAmount;

		System.out.println("Depreciation Amount = " + depreciationAmount);
		System.out.println("Value After Depreciation = " + finalValue);

	}

}
