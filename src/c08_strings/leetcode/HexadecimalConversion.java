/* 405. Convert a Number to Hexadecimal (Easy)
 ----------------------------------------------
Given a 32-bit integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.
All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.
Note: You are not allowed to use any built-in library method to directly solve this problem.

Example 1:
Input: num = 26
Output: "1a"

Example 2:
Input: num = -1
Output: "ffffffff"

 */

package c08_strings.leetcode;

public class HexadecimalConversion {
	public static void main(String[] args) {
		int num = 26;
		HexadecimalConversion obj = new HexadecimalConversion();
		String result = obj.toHex(num);
		System.out.println(result);
	}

	public String toHex(int num) {
//		String hex = Integer.toHexString(num);
//		return hex;

		char[] hex = "0123456789abcdef".toCharArray();
		String result = "";

		if (num == 0) {
			return "0";
		}

		while (num != 0) {
			int remainder = num & 15;
			result = hex[remainder] + result;
			num = num >>> 4;
		}

		return result;
	}

}
