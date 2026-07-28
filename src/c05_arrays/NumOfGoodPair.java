/* Numbers of Good Pairs :-
 -------------------------
 Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
hint :- Count how many times each number appears.
 If a number appears n times, then n * (n – 1) // 2 good pairs can be made with this number.
 */

package c05_arrays;

public class NumOfGoodPair {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 1, 3 };

		int result = numIdenticalPairs(nums);
		System.out.println("the numbers of pairs:" + result);

	}

	public static int numIdenticalPairs(int[] nums) {
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
