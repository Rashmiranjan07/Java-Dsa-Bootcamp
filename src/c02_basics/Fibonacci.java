//To calculate Fibonacci Series up to n numbers.

package c02_basics;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();

		int first = 0, second = 1;
		
		for ( int i=1; i<=n; i++) {
			 System.out.print(first + " ");
			 
			 int next = first + second;
	            first = second;
	            second = next;
		}
	}

}
