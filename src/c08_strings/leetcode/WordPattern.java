/* 290. Word Pattern (Easy)
---------------------------
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.
 
Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Explanation:
The bijection can be established as:

'a' maps to "dog".
'b' maps to "cat".

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false


 */


package c08_strings.leetcode;

import java.util.HashMap;

public class WordPattern {
	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog cat cat dog";
		WordPattern obj = new WordPattern();
		boolean result = obj.wordPattern(pattern, s);
		System.out.println(result);
	}

	public boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
		if (pattern.length() != words.length) {
			return false;
		}
		HashMap<Character, String> map1 = new HashMap<>();
		HashMap<String, Character> map2 = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			String word = words[i];
			if (map1.containsKey(ch) && !map1.get(ch).equals(word)) {
				return false;
			}
			if (map2.containsKey(word) && map2.get(word) != ch) {
				return false;
			}
			map1.put(ch, word);
			map2.put(word, ch);
		}
		return true;
	}

}
