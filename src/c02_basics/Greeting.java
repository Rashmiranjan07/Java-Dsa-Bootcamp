//Take name as input and print a greeting message for that particular name.
package c02_basics;

import java.util.Scanner;

public class Greeting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you name");
		String name = sc.nextLine();
		System.out.println("Hello " + name + " ! welcomme ");
	}
}
