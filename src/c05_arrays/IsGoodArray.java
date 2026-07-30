/* check if it's a good array or not ?
 *-------------------------------------
Given an array nums of positive integers. Your task is to select some subset of nums, multiply each element by an integer and add all these numbers. The array is said to be good if you can obtain a sum of 1 from the array by any possible subset and multiplicand.
Return True if the array is good otherwise return False.
Example 1:

Input: nums = [12,5,7,23]
Output: true
Explanation: Pick numbers 5 and 7.
5*3 + 7*(-2) = 1
Example 2:

Input: nums = [29,6,10]
Output: true
Explanation: Pick numbers 29, 6 and 10.
29*1 + 6*(-3) + 10*(-1) = 1

 */

package c05_arrays;

public class IsGoodArray {

	public static void main(String[] args) {

		int[] nums = { 12, 5, 7, 23 };

		if (isGoodArray(nums)) {
			System.out.println("Good Array");
		} else {
			System.out.println("Not a Good Array");
		}
	}

	public static boolean isGoodArray(int[] nums) {

		int gcd = nums[0];

		for (int i = 1; i < nums.length; i++) {

			gcd = findGCD(gcd, nums[i]);

			if (gcd == 1) {
				return true;
			}
		}

		return gcd == 1;
	}

	public static int findGCD(int a, int b) {

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}
}