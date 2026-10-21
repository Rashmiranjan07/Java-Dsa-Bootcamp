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
