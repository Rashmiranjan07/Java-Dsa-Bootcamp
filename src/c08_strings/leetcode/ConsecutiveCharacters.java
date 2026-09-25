/* 1446. Consecutive Characters (Easy)
--------------------------------------
The power of the string is the maximum length of a non-empty substring that contains only one unique character.
Given a string s, return the power of s.

 

Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

 */


package c08_strings.leetcode;

public class ConsecutiveCharacters {
	public static void main(String[] args) {
		String s = "abbcccddddeeeeedcba";
		ConsecutiveCharacters obj = new ConsecutiveCharacters();
		int result = obj.maxPower(s);
		System.out.println(result);

	}

	public int maxPower(String s) {
		int maxCount = 1;
		int count = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				count = 1;
			}

			maxCount = Math.max(maxCount, count);

		}
		return maxCount;
	}
}
