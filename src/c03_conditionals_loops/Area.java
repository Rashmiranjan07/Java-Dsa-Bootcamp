package c03_conditionals_loops;

import java.util.Scanner;

class AreaCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
		double area = Math.PI * radius * radius;

		System.out.println("Area of the circle = " + area);
	}

}

class AreaTriangle {
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

class Rectangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the width: ");
		double width = sc.nextDouble();

		System.out.print("Enter the length: ");
		double length = sc.nextDouble();

		double area = width * length;

		System.out.println("Area of Rectangle = " + area);
	}
}

class IsoscelesTriangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the equal side (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter the base (b): ");
        double b = sc.nextDouble();

        double h = Math.sqrt((a * a) - ((b * b) / 4));
        double area = (b * h) / 2;

        System.out.println("Height = " + h);
        System.out.println("Area of Isosceles Triangle = " + area);
	}
}

class Parallelogram{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the base: ");
		double base = sc.nextDouble();

		System.out.print("Enter the height: ");
		double height = sc.nextDouble();

		double area = base * height;

		System.out.println("Area of Parallelogram = " + area);
	}
	
}

class Rhombus{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the base: ");
		double base = sc.nextDouble();

		System.out.print("Enter the height: ");
		double height = sc.nextDouble();

		double area =0.5* base * height;

		System.out.println("Area of Rhombus = " + area);
	}
}
 
class EquilateralTriangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double side=sc.nextDouble();
		
		double area =0.43301270189 * side * side;
		
		System.out.println("Area of EquilateralTriangle = " + area);

	}
}

//Curved Surface Area Of Cylinder

class CurvedSurfaceCylinder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double r=sc.nextDouble();
		
		System.out.print("Enter the height: ");
		double h=sc.nextDouble();
		
		double area =2*Math.PI*r*h;
		
		System.out.println("Curved Surface Area Of Cylinder = " + area);
		
	}
}

//Total Surface Area Of Cube

class TotalSurfaceAreaOfCube{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double a=sc.nextDouble();
		
		double area=6*a*a;
		
		System.out.println("Total Surface Area Of Cube = " + area);
	}
}
