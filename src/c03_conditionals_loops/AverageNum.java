//Calculate Average Of N Numbers

package c03_conditionals_loops;

import java.util.Scanner;

public class AverageNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();

		int sum = 0;
		System.out.println("Enter " + n + " numbers:");

		for (int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			sum += num;
		}

		double average = (double) sum / n;

		System.out.println("Enter the average of " + n + " :" + average);
	}

}
