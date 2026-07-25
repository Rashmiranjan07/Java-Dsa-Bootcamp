//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

package c04_functions_methods;

import java.util.Scanner;

public class CompareNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st  number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number:");
		int c = sc.nextInt();
		System.out.println("Maximum number is: " + findMaximum(a, b, c));
		System.out.println("Minimum number is: " + findMinimum(a, b, c));

	}

	static int findMaximum(int a, int b, int c) {
		int max = 0;
		if (a >= b && a >= c) {
			max = a;

		} else if (b >= a && b >= c) {
			max = b;
		} else {
			max = c;
		}

		return max;
	}

	static int findMinimum(int a, int b, int c) {
		int min = 0;
		if (a <= b && a <= c) {
			min = a;

		} else if (b <= a && b <= c) {
			min = b;
		} else {
			min = c;
		}

		return min;

	}

}
