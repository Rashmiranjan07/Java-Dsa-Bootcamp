//Define a method that returns the product of two numbers entered by user.

package c04_functions_methods;

import java.util.Scanner;

public class ProductNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit :");
		int a = sc.nextInt();
		System.out.println("Enter another digit :");
		int b = sc.nextInt();
		int product = isProduct(a, b);
		System.out.println(product);
	}

	static int isProduct(int a, int b) {
		int pro = a * b;
		return pro;
	}

}
