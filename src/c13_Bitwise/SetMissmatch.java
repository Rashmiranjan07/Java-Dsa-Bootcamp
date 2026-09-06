/* 645. Set Mismatch (Easy)
----------------------------
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]

 */

package c13_Bitwise;

import java.util.Arrays;

public class SetMissmatch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 4 };
		SetMissmatch obj = new SetMissmatch();
		int[] result = obj.findErrorNums(arr);
		System.out.println(Arrays.toString(result));
	}

	public int[] findErrorNums(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] <= arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		// Search for the first missing Number
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != j + 1) {
				return new int[] { arr[j], j + 1 };
			}
		}

		return new int[] { -1, -1 };

	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}
}
