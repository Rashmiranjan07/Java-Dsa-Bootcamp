/* 1163. Last Substring in Lexicographical Order (Hard)
-------------------------------------------------------
Given a string s, return the last substring of s in lexicographical order.

Example 1:
Input: s = "abab"
Output: "bab"
Explanation: The substrings are ["a", "ab", "aba", "abab", "b", "ba", "bab"]. The lexicographically maximum substring is "bab".

Example 2:
Input: s = "leetcode"
Output: "tcode"
 */

package c08_strings.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographicalLastSubStr {
	public static void main(String[] args) {
		String s = "leetcode";
		LexicographicalLastSubStr obj = new LexicographicalLastSubStr();
		String ans = obj.lastSubstring(s);
		System.out.println(ans);
	}

	public String lastSubstring(String s) {

		List<String> substrings = new ArrayList<>();

		// Get all substrings
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				substrings.add(s.substring(i, j));
			}
		}

		// Sort in lexicographical order
		Collections.sort(substrings);

		String last;
		return last = substrings.get(substrings.size() - 1);
	}
}
