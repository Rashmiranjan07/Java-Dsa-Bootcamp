//Define a program to find out whether a given number is even or odd.

package c04_functions_methods;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number:");
		int n = sc.nextInt();
		checkEvenOdd(n);
	}

	static void checkEvenOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("The " + n +" is a even number");
		} else {
			System.out.println("The " + n +" is a odd number");

		}
	}

}
