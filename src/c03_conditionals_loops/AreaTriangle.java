//Area of Traingle 

package c03_conditionals_loops;

import java.util.Scanner;

public class AreaTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the base: ");
		double base = sc.nextDouble();

		System.out.print("Enter the height: ");
		double height = sc.nextDouble();

		double area = 0.5 * base * height;

		System.out.println("Area of Triangle = " + area);
	}
}
