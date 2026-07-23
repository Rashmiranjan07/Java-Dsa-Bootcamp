//Addition Of Two Numbers

package c03_conditionals_loops;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers: ");
		int a = sc.nextInt();
		System.out.println("Enter another numbers: ");
		int b = sc.nextInt();

		int sum = a + b;
		System.out.println("Addition of two numbers : " + sum);
	}

}
