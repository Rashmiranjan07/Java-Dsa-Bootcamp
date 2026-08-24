/*41. First Missing Positive (Hard) (Amazon)
 * -----------------------------------------
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.

 */

package c07_sorting.leetcode;

public class FirstMissingPossitive {
	public static void main(String[] args) {
		int[] nums = { 7,8,9,19 };
		FirstMissingPossitive obj = new FirstMissingPossitive();
		int result = obj.firstMissingPositive(nums);
		System.out.println(result);

	}

	public int firstMissingPositive(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i]-1;
			  if (arr[i] >= 1 && arr[i] <= arr.length
	                    && arr[i] != arr[correct]) {  // avoid the -ve number
				swap(arr, i, correct);
			} else {
				i++;
			}
		}

		 // Find the first missing positive number
        for (int index = 0; index < arr.length; index++) {

            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        return arr.length + 1;

	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}
