//Reverse A String In Java

package c03_conditionals_loops;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter :");
		String original = sc.nextLine();
		String reversed = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reversed = reversed + original.charAt(i);
		}
		System.out.println("The reverse string is :" + reversed);
	}

}
