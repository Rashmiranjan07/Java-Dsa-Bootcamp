package c03_conditionals_loops;

import java.util.Scanner;

class CirclePerimeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();

		double perimeter = 2 * Math.PI * radius;

		System.out.println("Perimeter (Circumference) of the Circle = " + perimeter);

	}

}
