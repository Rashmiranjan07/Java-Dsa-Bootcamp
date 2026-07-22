//To find out whether the given String is Palindrome or not.

package c02_basics;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		
		if (str.equalsIgnoreCase(reversed)) {
			System.out.println("The string is a Palindrome.");
		} else {
			System.out.println("The string is not a Palindrome.");
		}
	}

}
