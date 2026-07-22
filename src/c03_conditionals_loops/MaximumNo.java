//find the largest number among user input 

package c03_conditionals_loops;

import java.util.Scanner;

public class MaximumNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int a=sc.nextInt();
		System.out.println("enter a number:");
		int b=sc.nextInt();
		System.out.println("enter a number:");
		int c=sc.nextInt();
		
		int max=a;
		if( b>max) {
			max=b;
		}
		if( c> max) {
			max=c;
		}
		
		System.out.println("The maximum number is :"+max);
	}

}
