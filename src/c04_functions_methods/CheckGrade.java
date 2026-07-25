/*
 Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 

 */

package c04_functions_methods;

import java.util.Scanner;

public class CheckGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the result out of 100 :");
		int n = sc.nextInt();
		checkGrade(n);

	}

	static void checkGrade(int n) {
		if (100 > n && n > 91) {
			System.out.println("The grade is - AA");
		} else if (90 > n && n > 81) {
			System.out.println("The grade is - AB");
		} else if (80 > n && n > 71) {
			System.out.println("The grade is - BB");
		} else if (70 > n && n > 61) {
			System.out.println("The grade is - BC");
		} else if (60 > n && n > 51) {
			System.out.println("The grade is - CD");
		} else if (50 > n && n > 41) {
			System.out.println("The grade is - DD");
		} else {
			System.out.println("Fail");
		}
	}

}
