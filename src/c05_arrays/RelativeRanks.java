/*

Code
Testcase
Testcase
Test Result
506. Relative Ranks
Solved
Easy
Topics
premium lock icon
Companies
You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

The 1st place athlete's rank is "Gold Medal".
The 2nd place athlete's rank is "Silver Medal".
The 3rd place athlete's rank is "Bronze Medal".
For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete.

 

Example 1:

Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
Example 2:

Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].
 */




package c05_arrays;

import java.util.Arrays;

public class RelativeRanks {
	public static void main(String[] args) {
		int[] score = { 10, 3, 8, 9, 4 };
		RelativeRanks obj = new RelativeRanks();
		String[] ans = obj.findRelativeRanks(score);
		System.out.println(Arrays.toString(ans));
	}

	public String[] findRelativeRanks(int[] score) {

		int n = score.length;
		String[] answer = new String[n];

		// Create an array of indices
		Integer[] indices = new Integer[n];

		for (int i = 0; i < n; i++) {
			indices[i] = i;
		}
		// Sort indices based on scores (highest score first)
		Arrays.sort(indices, (a, b) -> score[b] - score[a]);

		// Assign ranks
		for (int i = 0; i < n; i++) {
			int originalIndex = indices[i];

			if (i == 0) {
				answer[originalIndex] = "Gold Medal";
			} else if (i == 1) {
				answer[originalIndex] = "Silver Medal";
			} else if (i == 2) {
				answer[originalIndex] = "Bronze Medal";
			} else {
				answer[originalIndex] = String.valueOf(i + 1);
			}
		}

		return answer;

	}

}
