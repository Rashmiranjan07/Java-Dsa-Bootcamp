//Basically Frequency of a digit inside  a number  

package c03_conditionals_loops;

import java.util.Scanner;

public class CountOccurance {
	public static void main(String[] args) {

		int n = 1333933;
		int count = 0;
		int rem;

		// Only frequency of the number :-
//		while ( n>0) {
//			rem=n%10 ; // last digit 
//			n=n/10;
//			count++;
//		}

		
		// Frequency of 3*
		while ( n>0) {
			rem=n%10 ; // last digit 
			if(rem==3) {
				count++;
			}
			n=n/10;
		}

		System.out.println("the frequency is " + count);
	}

}
