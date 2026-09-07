/* 1763. Longest Nice Substring (Easy)
---------------------------------------
A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.
Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

Example 1:
Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.

Example 2:
Input: s = "Bb"
Output: "Bb"
Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.

Example 3:
Input: s = "c"
Output: ""
Explanation: There are no nice substrings.
 */



package c13_Bitwise;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubString {
	public static void main(String[] args) {
		String s = "YazaAay";
		LongestNiceSubString obj = new LongestNiceSubString();
		String result = obj.longestNiceSubstring(s);
		System.out.println(result);
	}

	public String longestNiceSubstring(String s) {
		if (s.length() < 2)
			return "";

		Set<Character> set = new HashSet<>();

		for (char c : s.toCharArray()) {
			set.add(c);
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (!set.contains(Character.toLowerCase(c)) || !set.contains(Character.toUpperCase(c))) {

				String left = longestNiceSubstring(s.substring(0, i));
				String right = longestNiceSubstring(s.substring(i + 1));

				return left.length() >= right.length() ? left : right;
			}
		}

		return s;
	}
}