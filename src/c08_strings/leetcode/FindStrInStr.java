/* 28. Find the Index of the First Occurrence in a String (Easy)
 ---------------------------------------------------------------
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 
 */

package c08_strings.leetcode;

public class FindStrInStr {
	public static void main(String[] args) {
		String haystack = "leetcode";
		String needle = "leeto";
		FindStrInStr obj = new FindStrInStr();
		int result = obj.strStr(haystack, needle);
		System.out.println(result);

	}

	public int strStr(String haystack, String needle) {

//		if (haystack.contains(needle)) {
//			return 0;
//		}
//
//		return -1;

		return haystack.indexOf(needle);

	}

}
