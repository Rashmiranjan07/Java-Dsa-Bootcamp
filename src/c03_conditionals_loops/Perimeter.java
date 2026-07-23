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

class EquilateralTrianglePerimeter{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double side = sc.nextDouble();
		
		double perimeter = 3 * side;
		
		System.out.println("Perimeter of EquilateralTriangle "+ perimeter);

	}
}

class Parallelograms{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		double a = sc.nextDouble();
		
		System.out.print("Enter the side: ");
		double b = sc.nextDouble();
		
		double perimeter = 2 * (a+b);
		
		System.out.println("Perimeter of Parallelogram "+ perimeter);
	}
}