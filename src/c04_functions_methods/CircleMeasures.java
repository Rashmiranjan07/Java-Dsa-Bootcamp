//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

package c04_functions_methods;

import java.util.Scanner;

public class CircleMeasures {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius(r) of a circle :");
		double r = sc.nextDouble();
		double circumference = findCircumference(r);
		double area = findArea(r);
		System.out.println("the circumference is " + circumference);
		System.out.println("the area of circle is " + area);

	}

	static double findCircumference(double r) {
		return 2 * Math.PI * r;
	}

	static double findArea(double r) {
		return Math.PI * r * r;
	}

}
