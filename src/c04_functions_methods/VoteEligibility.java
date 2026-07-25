//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

package c04_functions_methods;

import java.util.Scanner;

public class VoteEligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter his/her age :");
		int n = sc.nextInt();
		CheckEligibility(n);
	}

	static void CheckEligibility(int n) {
		if (n >= 18) {
			System.out.println("he/she is Eligible for vote");
		} else {
			System.out.println("he/she is not Eligible for vote");

		}
	}

}
