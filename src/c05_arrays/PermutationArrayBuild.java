//Build an arrray from Permutation 

package c05_arrays;

import java.util.Arrays;

public class PermutationArrayBuild {
	public static void main(String[] args) {
		int[] nums = { 0, 2, 1, 5, 3, 4 };

		PermutationArrayBuild obj = new PermutationArrayBuild();
		int[] result = obj.buildArray(nums);
		System.out.println(Arrays.toString(result));
	}

	public int[] buildArray(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = nums[nums[i]]; // a new array contains the nums[nums[i]] 
		}
		return ans;
	}

}
