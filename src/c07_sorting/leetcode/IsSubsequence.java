package c07_sorting.leetcode;

public class IsSubsequence {
	public static void main(String[] args) {
		String s = "abx";
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
