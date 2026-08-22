package c07_sorting.leetcode;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
	public static void main(String[] args) {
		int nums[] = { 8, 1, 2, 2, 3 };
		SmallerNumbersThanCurrent obj = new SmallerNumbersThanCurrent();
		int result[] = obj.smallerNumbersThanCurrent(nums);
		System.out.println(Arrays.toString(result));

	}

	public int[] smallerNumbersThanCurrent(int[] nums) {
		int n = nums.length;
		int ans[] = new int[n];
		for (int i = 0; i < n; i++) { // this loop for pick one number
			int count = 0;
			for (int j = 0; j < n; j++) { // compare with others numbers
				if (nums[j] < nums[i]) {
					count++;
				}
			}
			ans[i] = count;
		}

		return ans;
	}

}
