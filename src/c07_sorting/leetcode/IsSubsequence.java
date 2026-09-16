/* 392. Is Subsequence (Easy)
  ---------------------------
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
 */


package c07_sorting.leetcode;

public class IsSubsequence {
	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		IsSubsequence obj = new IsSubsequence();
		boolean result = obj.isSubsequence(s, t);
		System.out.println(result);
	}

	public boolean isSubsequence(String s, String t) {
		if (t.length() < 0) {
			return false;
		}

		int j = 0;

		for (int i = 0; i < t.length() && j < s.length(); i++) {
			if (t.charAt(i) == s.charAt(j)) {
				j++;
			}
		}

		if (j == s.length()) {
			return true;
		}

		return false;

	}

}
