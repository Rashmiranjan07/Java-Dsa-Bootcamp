//Running sum of 1D Array
// input - [1,2,3,4]


package c05_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RunningSumArray {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };

		RunningSumArray obj = new RunningSumArray();
		int[] result = obj.runningSum(nums);
		System.out.println(Arrays.toString(result));

	}

	public int[] runningSum(int[] nums) {
		int n = nums.length;
		int[] runningSum = new int[n];

		runningSum[0] = nums[0];

		for (int i = 1; i < n; i++) {
			runningSum[i] = runningSum[i - 1] + nums[i];
		}

		return runningSum;

	}
}
