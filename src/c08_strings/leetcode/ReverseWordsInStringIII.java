/* 557. Reverse Words in a String III (Easy)
--------------------------------------------
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"

*/

package c08_strings.leetcode;

public class ReverseWordsInStringIII {
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		ReverseWordsInStringIII obj = new ReverseWordsInStringIII();
		String ans = obj.reverseWords(s);
		System.out.println(ans);

	}

	public String reverseWords(String s) {
		String[] words = s.trim().split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			String word = words[i];

			for (int j = word.length() - 1; j >= 0; j--) {
				result.append(word.charAt(j));
			}

			if (i < words.length - 1) {
				result.append(" ");
			}
		}

		return result.toString();
	}

}
