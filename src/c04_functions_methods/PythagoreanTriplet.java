//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

package c04_functions_methods;

import java.util.Scanner;

public class PythagoreanTriplet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		System.out.println("Enter c :");
		int c = sc.nextInt();
		boolean PythagoreanTriplet = isPythagoreanTriplet(a, b, c);
		System.out.println(PythagoreanTriplet);

	}

	public static boolean isPythagoreanTriplet(int a, int b, int c) {
		int sqA = a * a;
		int sqB = b * b;
		int sqC = c * c;

		// Check all combinations since the largest number (hypotenuse) is unknown
		return (sqA + sqB == sqC) || (sqA + sqC == sqB) || (sqB + sqC == sqA);
	}

}
