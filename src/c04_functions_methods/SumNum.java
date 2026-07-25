//Write a program to print the sum of two numbers entered by user by defining your own method.

package c04_functions_methods;

import java.util.Scanner;

public class SumNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit :");
		int a = sc.nextInt();
		System.out.println("Enter another digit :");
		int b = sc.nextInt();
		int add = isSum(a, b);
		System.out.println(add);
	}

	static int isSum(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
