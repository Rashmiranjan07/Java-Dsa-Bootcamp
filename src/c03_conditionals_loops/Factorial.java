//Factorial Program In Java

package c03_conditionals_loops;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers: ");
		int n = sc.nextInt();
		int factorial=1;
		for ( int i =1;i<= n; i++) {
		factorial=factorial*i;
		}
		System.out.println(factorial);
	}
}
