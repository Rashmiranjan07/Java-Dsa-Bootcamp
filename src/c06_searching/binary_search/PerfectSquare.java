/* 367. Valid perfect square 
  ---------------------------
Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.

Example 1:

Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
Example 2:

Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

 */

package c06_searching.binary_search;

public class PerfectSquare {
	public static void main(String[] args) {
		int num = 16;
		PerfectSquare obj = new PerfectSquare();
		boolean result = obj.isPerfectSquare(num);
		System.out.println(result);

	}

	public boolean isPerfectSquare(int num) {
		int start = 0;
		int end = num;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid * mid == num) {
				return true;
			} else if (mid * mid < num) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}

}
