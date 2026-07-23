package c03_conditionals_loops;

import java.util.Scanner;

class Cone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the base: ");
		double a = sc.nextDouble();

		System.out.print("Enter the height: ");
		double b = sc.nextDouble();

		double volume = (1.0 / 3.0) * Math.PI * Math.pow(a, 2) * b;

		System.out.println("Volume of Cone = " + volume);
	}
}

class Prism {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the base: ");
		double b = sc.nextDouble();

		System.out.print("Enter the height: ");
		double h = sc.nextDouble();

		double volume = b * h;

		System.out.println("Volume of Prism = " + volume);

	}
}

class Cylinder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double r = sc.nextDouble();

		System.out.print("Enter the height: ");
		double h = sc.nextDouble();
		
		double volume= Math.PI*r*r*h;
		
		System.out.println("Volume of Cylinder = " + volume);
	}
}
