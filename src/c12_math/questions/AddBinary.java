/* 67. Add Binary (Easy)
------------------------
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"
 */

package c12_math.questions;

public class AddBinary {
	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		AddBinary obj = new AddBinary();
		String result = obj.addBinary(a, b);
		System.out.println(result);

	}

	public String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();

		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;

		while (i >= 0 || j >= 0 || carry != 0) {
			int sum = carry;

			if (i >= 0) {
				sum += a.charAt(i) - '0';
				i--;
			}

			if (j >= 0) {
				sum += b.charAt(j) - '0';
				j--;
			}

			result.append(sum % 2);
			carry = sum / 2;
		}

		return result.reverse().toString();
	}

}
