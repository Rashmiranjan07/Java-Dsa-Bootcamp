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

		Pangram obj = new Pangram();
		boolean result = obj.checkIfPangram(sentence);
		System.out.println(result);

	}

	public boolean checkIfPangram(String sentence) {
		return false;

	}

}
