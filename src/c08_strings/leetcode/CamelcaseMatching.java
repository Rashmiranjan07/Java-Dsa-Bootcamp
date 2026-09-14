/*

 */



package c08_strings.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
	public static void main(String[] args) {
		String[] queries = { "FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack" };
		String pattern = "FB";
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
