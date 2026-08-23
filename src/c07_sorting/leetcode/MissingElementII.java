/*268. Missing Number (easy) ( amazon )
 * -------------------------------------
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

public class MissingElementII {
	public static void main(String[] args) {
		int arr[] = { 0, 1 };
		MissingElementII obj = new MissingElementII();
		int result = obj.missingNumber(arr);
		System.out.println(result);
	}

	public int missingNumber(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1; // correct index= value-1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		return;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}

/*
 * This Question in from amazon interview . lets think how can we solve this
 * question using Cycle Sort Cycle sort defines that we can use it 1-n . we can
 * sort first and every index contains that number if any index doesnot contain
 * that value i.e the mising number
 * 
 */
