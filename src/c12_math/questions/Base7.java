/*
504. Base 7
Easy
Topics
premium lock icon
Companies
Given an integer num, return a string of its base 7 representation.

 

Example 1:

Input: num = 100
Output: "202"
Example 2:

Input: num = -7
Output: "-10"
 */

package c12_math.questions;

public class Base7 {
	public static void main(String[] args) {
		int num = 100;
		Base7 obj = new Base7();
		String result = obj.convertToBase7(num);
		System.out.println(result.toString());
	}

	public String convertToBase7(int num) {

		if (num == 0) {
			return "0";
		}

		String ans = " ";

		while (num > 0) {
			int rem = num % 7;
			ans = rem + ans;
			num = num / 7;
		}
		return ans;
	}

}
