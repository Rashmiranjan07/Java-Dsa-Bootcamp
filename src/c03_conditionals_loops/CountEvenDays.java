//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

package c03_conditionals_loops;

import java.util.Scanner;

public class CountEvenDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the days of that month which kunal go-out: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println("Kunal can go out " + count + " days.");
	}

}
