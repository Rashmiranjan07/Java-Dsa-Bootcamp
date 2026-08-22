/* 1365. How Many Numbers Are Smaller Than the Current Number ( easy)
 * ------------------------------------------------------------------
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.

Example 1:
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

Example 2:
Input: nums = [6,5,4,8]
Output: [2,1,0,3]
Example 3:

Input: nums = [7,7,7,7]
Output: [0,0,0,0]

 */

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
