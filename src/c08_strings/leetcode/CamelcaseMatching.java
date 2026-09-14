/* 1023. Camelcase Matching (Medium)
-------------------------------------
Given an array of strings queries and a string pattern, return a boolean array answer where answer[i] is true if queries[i] matches pattern, and false otherwise.
A query word queries[i] matches pattern if you can insert lowercase English letters into the pattern so that it equals the query. You may insert a character at any position in pattern or you may choose not to insert any characters at all.

Example 1:
Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FB"
Output: [true,false,true,true,false]
Explanation: "FooBar" can be generated like this "F" + "oo" + "B" + "ar".
"FootBall" can be generated like this "F" + "oot" + "B" + "all".
"FrameBuffer" can be generated like this "F" + "rame" + "B" + "uffer".

Example 2:
Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBa"
Output: [true,false,true,false,false]
Explanation: "FooBar" can be generated like this "Fo" + "o" + "Ba" + "r".
"FootBall" can be generated like this "Fo" + "ot" + "Ba" + "ll".

Example 3:
Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBaT"
Output: [false,true,false,false,false]
Explanation: "FooBarTest" can be generated like this "Fo" + "o" + "Ba" + "r" + "T" + "est".

 */



package c08_strings.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
	public static void main(String[] args) {
		String[] queries = { "FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack" };
		String pattern = "FB";
		CamelcaseMatching obj = new CamelcaseMatching();
	}

	public List<Boolean> camelMatch(String[] queries, String pattern) {
		List<Boolean> result = new ArrayList<>();

		for (String query : queries) {
			result.add(matches(query, pattern));
		}

		return result;
	}

	private boolean matches(String query, String pattern) {
		int j = 0;

		for (char ch : query.toCharArray()) {

			// Match pattern character
			if (j < pattern.length() && ch == pattern.charAt(j)) {
				j++;
			}
			// Extra uppercase character is not allowed
			else if (Character.isUpperCase(ch)) {
				return false;
			}
		}

		// All pattern characters must be matched
		return j == pattern.length();
	}

}
