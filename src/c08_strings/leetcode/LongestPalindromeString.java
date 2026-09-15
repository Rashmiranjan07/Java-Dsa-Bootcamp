/* 5. Longest Palindromic Substring (Medium)
 * -----------------------------------------
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

 */

package c08_strings.leetcode;

public class LongestPalindromeString {
	public static void main(String[] args) {
		String s = "babad";
		LongestPalindromeString obj = new LongestPalindromeString();
		String result = obj.longestPalindrome(s);
		System.out.println(result);
	}

	public String longestPalindrome(String s) {
		String longest = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String sub = s.substring(i, j + 1);
				if (isPalindrome(sub) && sub.length() > longest.length()) {
					longest = sub;
				}
			}
		}
		return longest;
	}

	public boolean isPalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}
}
