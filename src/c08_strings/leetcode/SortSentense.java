package c08_strings.leetcode;

public class SortSentense {
	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		SortSentense obj = new SortSentense();
		String ans = obj.sortSentence(s);
		System.out.println(ans);

	}

	public String sortSentence(String s) {
		String[] words = s.split(" ");

		String result = "";

		for (int i = 0; i <= words.length; i++) {
			for (String word : words) {
				if (word.endsWith(String.valueOf(i))) {
					result += word.substring(0, word.length() - 1) + " ";
				}
			}
		}

		return result.trim();

	}

}
