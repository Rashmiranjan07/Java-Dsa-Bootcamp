package c07_sorting.leetcode;

public class IsSubsequence {
	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
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
