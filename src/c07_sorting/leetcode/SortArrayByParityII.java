/*

 */

package c07_sorting.leetcode;

import java.util.Arrays;

public class SortArrayByParityII {
	public static void main(String[] args) {

		int[] nums = { 4, 2, 5, 7 };
		sortArrayByParityII(nums);
		System.out.println(Arrays.toString(nums));

	}

	static public int[] sortArrayByParityII(int[] nums) {

		int[] newArr = new int[nums.length];

		// int index = 0;
		int evenIndex = 0;
		int oddIndex = 1;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {
				newArr[evenIndex] = nums[i];
				evenIndex += 2;

			} else {
				newArr[oddIndex] = nums[i];
				oddIndex += 2;
			}

		}

		return newArr;

	}

}
