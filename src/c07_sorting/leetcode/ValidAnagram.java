/* 242. Valid Anagram (Easy)
-----------------------------
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "rat", t = "car"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

 */


package c07_sorting.leetcode;

public class ValidAnagram {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		ValidAnagram obj = new ValidAnagram();
		boolean result = obj.isAnagram(s, t);
		System.out.println(result);
	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] count = new int[26];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}

		for (int val : count) {
			if (val != 0) {
				return false;
			}
		}

		return true;
	}

}
