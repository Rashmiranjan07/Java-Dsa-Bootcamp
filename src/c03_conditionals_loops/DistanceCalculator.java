//Calculate the distance between two points

package c03_conditionals_loops;

import java.util.Scanner;

public class DistanceCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1: ");
		double x1 = sc.nextDouble();

		System.out.print("Enter y1: ");
		double y1 = sc.nextDouble();

		System.out.print("Enter x2: ");
		double x2 = sc.nextDouble();

		System.out.print("Enter y2: ");
		double y2 = sc.nextDouble();

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("Distance between two points = " + distance);

	}

}
