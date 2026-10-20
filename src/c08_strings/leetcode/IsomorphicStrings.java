/* 205. Isomorphic Strings (Easy)
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Explanation:
The strings s and t can be made identical by:
Mapping 'e' to 'a'.
Mapping 'g' to 'd'.

Example 2:
Input: s = "f11", t = "b23"
Output: false
Explanation:
The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.

Example 3:
Input: s = "paper", t = "title"
Output: true
 */



package c08_strings.leetcode;

public class IsomorphicStrings {
	public static void main(String[] args) {
		String s="egg";
		String t="add";
		IsomorphicStrings obj = new IsomorphicStrings();
		boolean result=obj.isIsomorphic(s, t);
		System.out.println(result);

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
