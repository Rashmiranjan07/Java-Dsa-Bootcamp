/*

Code
Testcase
Testcase
Test Result
1813. Sentence Similarity III
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given two strings sentence1 and sentence2, each representing a sentence composed of words. A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of only uppercase and lowercase English characters.

Two sentences s1 and s2 are considered similar if it is possible to insert an arbitrary sentence (possibly empty) inside one of these sentences such that the two sentences become equal. Note that the inserted sentence must be separated from existing words by spaces.

For example,

s1 = "Hello Jane" and s2 = "Hello my name is Jane" can be made equal by inserting "my name is" between "Hello" and "Jane" in s1.
s1 = "Frog cool" and s2 = "Frogs are cool" are not similar, since although there is a sentence "s are" inserted into s1, it is not separated from "Frog" by a space.
Given two sentences sentence1 and sentence2, return true if sentence1 and sentence2 are similar. Otherwise, return false.

 

Example 1:

Input: sentence1 = "My name is Haley", sentence2 = "My Haley"

Output: true

Explanation:

sentence2 can be turned to sentence1 by inserting "name is" between "My" and "Haley".

Example 2:

Input: sentence1 = "of", sentence2 = "A lot of words"

Output: false

Explanation:

No single sentence can be inserted inside one of the sentences to make it equal to the other.

Example 3:

Input: sentence1 = "Eating right now", sentence2 = "Eating"

Output: true

Explanation:

sentence2 can be turned to sentence1 by inserting "right now" at the end of the sentence.
 */

package c08_strings.leetcode;

public class SentenseSimillarityIII {
	public static void main(String[] args) {
		String sentence1 = "My name is Haley";
		String sentence2 = "My Haley";
		SentenseSimillarityIII obj = new SentenseSimillarityIII();
		boolean result = obj.areSentencesSimilar(sentence1, sentence2);
		System.out.println(result);

	}

	public boolean areSentencesSimilar(String sentence1, String sentence2) {

		String[] a = sentence1.split(" ");
		String[] b = sentence2.split(" ");

		// Make 'a' the longer sentence
		if (a.length < b.length) {
			String[] temp = a;
			a = b;
			b = temp;
		}

		int left = 0;
		int rightA = a.length - 1;
		int rightB = b.length - 1;

		// Match words from the beginning
		while (left < b.length && a[left].equals(b[left])) {
			left++;
		}

		// Match words from the end
		while (rightB >= left && a[rightA].equals(b[rightB])) {
			rightA--;
			rightB--;
		}

		// If all words of the shorter sentence matched,
		// the sentences are similar
		return rightB < left;
	}

}
