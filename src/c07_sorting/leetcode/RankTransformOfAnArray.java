/* 1331. Rank Transform of an Array (easy)
 * ---------------------------------------
Given an array of integers arr, replace each element with its rank.
The rank represents how large the element is. The rank has the following rules:
Rank is an integer starting from 1.
The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
Rank should be as small as possible.
 
Example 1:
Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.

Example 2:
Input: arr = [100,100,100]
Output: [1,1,1]
Explanation: Same elements share the same rank.

Example 3:
Input: arr = [37,12,28,9,100,56,80,5,12]
Output: [5,3,4,2,8,6,7,1,3]
 */

package c07_sorting.leetcode;

import java.util.Arrays;

public class RankTransformOfAnArray {
	public static void main(String[] args) {
		int[] arr = { 37, 12, 28, 9, 100, 56, 80, 5, 12 };
		RankTransformOfAnArray obj = new RankTransformOfAnArray();
		int[] result = obj.arrayRankTransform(arr);
		System.out.println(Arrays.toString(result));

	}

	public int[] arrayRankTransform(int[] arr) {

		int[] sorted = arr.clone();
		Arrays.sort(sorted);

		for (int i = 0; i < arr.length; i++) {
			int rank = 1;
			for (int j = 0; j < sorted.length; j++) {
				if (j > 0 && sorted[j] == sorted[j - 1]) {
					continue;
				}
				if (arr[i] == sorted[j]) {
					arr[i] = rank;
					break;
				}
				rank++;
			}
		}
		return arr;
	}
}