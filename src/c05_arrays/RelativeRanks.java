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
