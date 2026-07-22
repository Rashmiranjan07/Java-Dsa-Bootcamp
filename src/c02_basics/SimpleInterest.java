//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package c02_basics;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter principal(P) : ");
		int principal = sc.nextInt();

		System.out.println("Enter time(T) : ");
		int time = sc.nextInt();

		System.out.println("Enter rate(R) : ");
		int rate = sc.nextInt();

		double simpleInterest = ((principal * time * rate) / 100);
		System.out.println("the Simple Interest is :" + simpleInterest);

	}

}
