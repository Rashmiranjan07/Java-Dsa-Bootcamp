/* 859. Buddy Strings (Easy)
-----------------------------
Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 
Example 1:
Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

Example 2:
Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.

Example 3:
Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.

 */

package c08_strings.leetcode;

public class BuddyStrings {
	public static void main(String[] args) {
		String s = "aa";
		String goal = "aa";
		BuddyStrings obj = new BuddyStrings();
		boolean result = obj.buddyStrings(s, goal);
		System.out.println(result);
	}

	public boolean buddyStrings(String s, String goal) {

		if (s.length() != goal.length()) {
			return false;
		}

		// Find the different positions
		int first = -1;
		int second = -1;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != goal.charAt(i)) {

				if (first == -1) {
					first = i;
				} else if (second == -1) {
					second = i;
				} else {
					return false;
				}
			}
		}

		// Strings are already same
		if (first == -1) {

			// Check if any character occurs twice
			for (int i = 0; i < s.length(); i++) {
				for (int j = i + 1; j < s.length(); j++) {

					if (s.charAt(i) == s.charAt(j)) {
						return true;
					}
				}
			}

			return false;
		}

		// Only one different character
		if (second == -1) {
			return false;
		}

		// Check whether swapping makes them equal
		return s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
	}
}
