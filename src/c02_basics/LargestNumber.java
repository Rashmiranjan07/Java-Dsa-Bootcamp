//Take 2 numbers as input and print the largest number.

package c02_basics;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter another number : ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("Largest number = " + num1);
		} else if (num2 > num1) {
			System.out.println("Largest number = " + num2);
		} else {
			System.out.println("Both numbers are equal.");
		}
	}

}
