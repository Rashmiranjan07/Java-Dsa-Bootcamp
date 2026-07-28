/* Check if the sentense is pangram or not ?
 -------------------------------------------
 A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

 */

package c05_arrays;

public class Pangram {
	public static void main(String[] args) {
		 String sentence = "thequickbrownfoxjumpsoverthelazydog";
		//String sentence = "abcdefghijklmnopqrstuvwxyz";

		Pangram obj = new Pangram();
		boolean result = obj.checkIfPangram(sentence);
		System.out.println(result);

	}

	public boolean checkIfPangram(String sentence) {
		if (sentence == null || sentence.length() < 26) {
			return false;
		}

		boolean[] visited = new boolean[26];
		int Count = 0;

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				int index = ch - 'a';

				if (!visited[index]) {
					visited[index] = true;
					Count++;
				}
			}
		}

		return Count == 26;
	}
}