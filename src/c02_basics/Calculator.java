//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package c02_basics;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter another number : ");
		int num2 = sc.nextInt();

		System.out.println("Enter a operater (+,-,*,/ : ");
		char operator = sc.next().charAt(0);

		if (operator == '+') {
			System.out.println("Result : " + (num1 + num2));
		} else if (operator == '-') {
			System.out.println("Result : " + (num1 - num2));
		} else if (operator == '*') {
			System.out.println("Result : " + (num1 * num2));
		} else if (operator == '/') {
			System.out.println("Result : " + (num1 / num2));
		}
	}

}
