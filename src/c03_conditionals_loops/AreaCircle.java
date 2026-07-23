//Area Of Circle Java Program
package c03_conditionals_loops;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
		double area = Math.PI * radius * radius;

		System.out.println("Area of the circle = " + area);
	}

}
