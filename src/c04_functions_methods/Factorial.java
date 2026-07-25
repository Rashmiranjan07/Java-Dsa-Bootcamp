/*
Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1
 */

package c04_functions_methods;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int factorial= isFactorial(n);
		System.out.println(factorial);
	}

	static int isFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact =fact* i;
		}
		return fact;

	}

}
