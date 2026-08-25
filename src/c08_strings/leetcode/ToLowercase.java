/* 709. To Lower Case (Easy)
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

Example 1:
Input: s = "Hello"
Output: "hello"

Example 2:
Input: s = "here"
Output: "here"

Example 3:
Input: s = "LOVELY"
Output: "lovely"
 */

package c08_strings.leetcode;

public class ToLowercase {
	public static void main(String[] args) {
		String s = "LOVELY";
		ToLowercase obj = new ToLowercase();
		String result = obj.toLowerCase(s);
		System.out.println(result);
	}

	public String toLowerCase(String s) {
		String str = s.toLowerCase();

		return str;

	}

}
