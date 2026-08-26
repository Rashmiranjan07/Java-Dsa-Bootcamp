/* 14. Longest Common Prefix (Easy)
 * --------------------------------
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

package c08_strings.leetcode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		LongestCommonPrefix obj = new LongestCommonPrefix();

		String result = obj.longestCommonPrefix(strs);
		System.out.println(result);

	}

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0]; // prefix = flower

		for (int i = 1; i < strs.length; i++) {
			while (!strs[i].startsWith(prefix)) { // "Does this string start with prefix?"
													// checks flow - flower

				prefix = prefix.substring(0, prefix.length() - 1); // if not start eith then remove the prefix last
																	// letter
																	// until flow - flow
																	// then check with flight wherever new prefix is
																	// flow
																	// and finaly we got "fl"

				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		return prefix;
	}

}
