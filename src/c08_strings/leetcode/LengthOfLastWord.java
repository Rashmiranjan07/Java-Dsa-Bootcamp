/* 58. Length of Last Word (Easy)
---------------------------------
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

 */

package c08_strings.leetcode;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String s = "   fly me   to   the moon ";
		LengthOfLastWord obj = new LengthOfLastWord();
		int result = obj.lengthOfLastWord(s);
		System.out.println(result);
	}

	public int lengthOfLastWord(String s) {
		String[] words = s.trim().split("\\s+");

		String lastWord = words[words.length - 1];

		int length = lastWord.length();

		return length;

	}

}
