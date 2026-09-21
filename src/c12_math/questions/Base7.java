/* 504. Base 7 (Easy)
  ------------------
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

		boolean negative = num < 0;

		if (negative) {
			num = -num;
		}

		String ans = "";

		while (num > 0) {
			int remainder = num % 7;
			ans = remainder + ans;
			num = num / 7;
		}

		if (negative) {
			ans = "-" + ans;
		}

		return ans;
	}

}
