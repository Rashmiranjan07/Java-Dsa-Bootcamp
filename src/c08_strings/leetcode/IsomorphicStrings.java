package c08_strings.leetcode;

public class IsomorphicStrings {
	public static void main(String[] args) {
		String s="egg";
		String t="add";

	}

	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] mapST = new int[65536];
		int[] mapTS = new int[65536];

		for (int i = 0; i < s.length(); i++) {

			char a = s.charAt(i);
			char b = t.charAt(i);

			if (mapST[a] != mapTS[b]) {
				return false;
			}

			mapST[a] = i + 1;
			mapTS[b] = i + 1;
		}

		return true;
	}

}
