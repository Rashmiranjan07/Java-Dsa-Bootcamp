//Take integer inputs till the user enters 0 and print the largest number from all.

package c03_conditionals_loops;

import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int n = sc.nextInt();
		int max = n;
		while (n != 0) {
			if (n > max) {
				max = n;
			}
			n = sc.nextInt();
		}
		System.out.println("Largest number = " + max);
	}

}
