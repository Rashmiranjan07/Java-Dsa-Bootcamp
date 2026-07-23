//Calculate Average Marks

package c03_conditionals_loops;

import java.util.Scanner;

public class AverageMarks {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of subjects: ");
	        int n = sc.nextInt();
	        
	        int sum=0;
	        
	        for (int i=1; i<=n; i++) {
	        	System.out.print("Enter marks of subject " + i + ": ");
	        	 int marks = sc.nextInt();
	             sum += marks;
	        }
	        
	        double average = (double) sum / n;
	        
	        System.out.println("Enter the total marks : "+ sum);
	        System.out.println("Enter the average of marks : "+ average);

	}

}
