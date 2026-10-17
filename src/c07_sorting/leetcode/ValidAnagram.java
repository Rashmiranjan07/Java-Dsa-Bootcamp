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
