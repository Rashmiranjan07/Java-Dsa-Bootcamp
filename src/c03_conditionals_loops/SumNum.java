//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package c03_conditionals_loops;

import java.util.Scanner;

public class SumNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			sum += n;
			n = sc.nextInt(); // new integer
		}

		System.out.println("The sum of total taken integer:" + sum);

	}

}
