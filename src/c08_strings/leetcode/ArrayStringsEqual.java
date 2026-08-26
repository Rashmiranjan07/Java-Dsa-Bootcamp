/* 1662. Check If Two String Arrays are Equivalent ( easy)
  -------------------------------------------------------
 Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

Example 3:
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
*/

package c08_strings.leetcode;

public class ArrayStringsEqual {
	public static void main(String[] args) {
		String[] word1 = { "ab", "c" };
		String[] word2 = { "a", "bc" };
		ArrayStringsEqual obj = new ArrayStringsEqual();
		boolean result = obj.arrayStringsAreEqual(word1, word2);
		System.out.println(result);
	}

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

		StringBuilder result1 = new StringBuilder();
		StringBuilder result2 = new StringBuilder();

		for (String s : word1) {
			result1.append(s);
		}

		for (String s : word2) {
			result2.append(s);
		}

		return result1.toString().equals(result2.toString());

	}

}
