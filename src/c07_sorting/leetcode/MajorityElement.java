/*169. Majoority Element (easy)
 ------------------------------
 Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

 */

package c07_sorting.leetcode;

public class MajorityElement {
	public static void main(String[] args) {
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		MajorityElement obj = new MajorityElement();
		int result = obj.majorityElement(nums);
		System.out.println(result);

	}

	public int majorityElement(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}

		int count = 1;
		int maxCount = 1;
		int element = nums[0];

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] == nums[i - 1]) {
				count++;
			} else {
				count = 1;
			}

			if (count > maxCount) {
				maxCount = count;
				element = nums[i];
			}
		}

		return element;

	}
}
