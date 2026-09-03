/* 1513.Number of Substrings With Only 1s ( Medium )
  -------------------------------------------------
Given a binary string s, return the number of substrings with all characters 1's. Since the answer may be too large, return it modulo 109 + 7.
Example 1:
Input: s = "0110111"
Output: 9
Explanation: There are 9 substring in total with only 1's characters.
"1" -> 5 times.
"11" -> 3 times.
"111" -> 1 time.

Example 2:
Input: s = "101"
Output: 2
Explanation: Substring "1" is shown 2 times in s.

Example 3:
Input: s = "111111"
Output: 21
Explanation: Each substring contains only 1's characters.

 */

package c08_strings.leetcode;

public class NumberOf1sSubStr {
	public static void main(String[] args) {
		String s = "101";
		NumberOf1sSubStr obj = new NumberOf1sSubStr();
		int result = obj.numSub(s);
		System.out.println(result);
	}

	public int numSub(String s) {
//		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j <= s.length(); j++) {
//				String sub = s.substring(i, j);
//
//				if (sub.indexOf('0') == -1) {
//					count++;
//				}
//			}
//		}
//		return count;

		long count = 0;
		long ones = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '1') {
				ones++;
				count += ones;
			} else {
				ones = 0;
			}
		}

		return (int) (count % 1000000007);
	}

}
