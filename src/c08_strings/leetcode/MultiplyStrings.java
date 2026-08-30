/* 43. Multiply Strings (Medium)
 * -----------------------------
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"

 */

package c08_strings.leetcode;

public class MultiplyStrings {
	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "456";
		MultiplyStrings obj = new MultiplyStrings();
		String result = obj.multiply(num1, num2);
		System.out.println(result);

	}

	public String multiply(String num1, String num2) {

		if (num1.equals("0") || num2.equals("0")) { // if any "0" contains then return "0"
			return "0";
		}

		int[] result = new int[num1.length() + num2.length()]; // the size of an result array

		for (int i = num1.length() - 1; i >= 0; i--) { // go into num1 strings..
			for (int j = num2.length() - 1; j >= 0; j--) { // go into num2 strings..

				int a = num1.charAt(i) - '0'; // convert to char
				int b = num2.charAt(j) - '0'; // convert to char

				int pos = i + j + 1;

				int total = a * b + result[pos];

				result[pos] = total % 10;
				result[pos - 1] += total / 10;
			}
		}

		StringBuilder ans = new StringBuilder();

		for (int x : result) {
			if (ans.length() == 0 && x == 0) {
				continue;
			}
			ans.append(x);
		}

		return ans.toString();
	}
}
