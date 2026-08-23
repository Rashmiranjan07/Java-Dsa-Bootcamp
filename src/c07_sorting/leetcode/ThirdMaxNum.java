/* 414. Third Maximum Number (easy)
 ----------------------------------
 Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Example 2:
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.

 */

/*
For this we do not need sorting 
 */

package c07_sorting.leetcode;

public class ThirdMaxNum {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 3, 1 };
		ThirdMaxNum obj = new ThirdMaxNum();
		int result = obj.thirdMax(nums);
		System.out.println(result);

	}

	public int thirdMax(int[] nums) {
		long first = Long.MIN_VALUE;
		long second = Long.MIN_VALUE;
		long third = Long.MIN_VALUE;

		for (int num : nums) {

			if (num == first || num == second || num == third) {
				continue;
			}

			if (num > first) {
				third = second;
				second = first;
				first = num;
			} else if (num > second) {
				third = second;
				second = num;
			} else if (num > third) {
				third = num;
			}
		}

		if (third == Long.MIN_VALUE) {
			return (int) first;
		}

		return (int) third;
	}

}
