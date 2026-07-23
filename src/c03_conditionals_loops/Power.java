//Power In Java

package c03_conditionals_loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		double n=sc.nextDouble();
		double power = n*n*n;
		
		System.out.println("the power of "+n+ " is : "+ power);
	}

}
