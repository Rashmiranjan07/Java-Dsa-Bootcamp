// Java Program Vowel Or Consonant

package c03_conditionals_loops;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("it is a vowel");
		} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			
			System.out.println(ch + " is a Consonant");

		} else {

			System.out.println("Invalid Input");
		}
	}

}
