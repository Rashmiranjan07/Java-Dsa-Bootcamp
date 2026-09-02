/*
60. Permutation Sequence
Solved
Hard
Topics
premium lock icon
Companies
The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

 

Example 1:

Input: n = 3, k = 3
Output: "213"
Example 2:

Input: n = 4, k = 9
Output: "2314"
Example 3:

Input: n = 3, k = 1
Output: "123"
 */


package c12_math.questions;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
	public static void main(String[] args) {
		int n = 3;
		int k = 3; // give me the 3rd permutation in lexicographical order
		PermutationSequence obj = new PermutationSequence();
		String result = obj.getPermutation(n, k);
		System.out.println(result);

	}

	public String getPermutation(int n, int k) {
		// Store numbers 1 to n
		List<Integer> numbers = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			numbers.add(i);
		}
		// Calculate (n - 1)!
		int fact = 1;

		for (int i = 1; i < n; i++) {
			fact *= i;
		}

		// Convert k to zero-based
		k--;

		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < n; i++) {

			// Find which group we need
			int index = k / fact;

			// Pick the number
			ans.append(numbers.get(index));

			// Remove the picked number
			numbers.remove(index);

			// Find position inside the selected group
			k = k % fact;

			// Calculate factorial for next position
			if (numbers.size() > 0) {
				fact = fact / numbers.size();
			}
		}

		return ans.toString();
	}

}
