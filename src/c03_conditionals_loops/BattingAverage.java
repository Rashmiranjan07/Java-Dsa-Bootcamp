//Calculate Batting Average

package c03_conditionals_loops;

import java.util.Scanner;

public class BattingAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the runs: ");
		int runs = sc.nextInt();
		
		System.out.println("Enter the matches played");
		int matches = sc.nextInt();
		
		System.out.println("Enter the time he not out: ");
		int notOut = sc.nextInt();

		int timesOut = matches - notOut;

		if (timesOut == 0) {
			System.out.println("Infinity");
		} else {
			double average = (double) runs / timesOut;
			System.out.printf("%.2f", average);
		}

	}

}
