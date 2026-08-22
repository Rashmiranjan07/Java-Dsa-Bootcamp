/*268. Missing Number (easy)
 * -------------------------
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation:
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8

 */


package c07_sorting.leetcode;

public class MissingElement {
	public static void main(String[] args) {
		int nums[] = { 0,1 };
		MissingElement obj = new MissingElement();
		int result = obj.missingNumber(nums);
		System.out.println(result);

	}

	public int missingNumber(int[] nums) {
		for (int i = 0; i <= nums.length - 2; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (nums[j] < nums[j - 1]) {

					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}

		int n = nums.length;
		int expectedSum = n * (n + 1) / 2;

		int actualSum = 0;

		for (int i = 0; i < nums.length; i++) {
			actualSum += nums[i];
		}

		int missingNum = 0;
		return missingNum = expectedSum - actualSum;

	}

}
