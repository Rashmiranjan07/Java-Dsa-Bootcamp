/* Remove duplicates from sorted array
 * 
 Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
Custom Judge:
The judge will test your solution with the following code:
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length
int k = removeDuplicates(nums); // Calls your implementation
assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

 */





package c05_arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		RemoveDuplicates obj = new RemoveDuplicates();
		int k = obj.removeDuplicates(nums);

		System.out.println("Unique Elements Count: " + k);

		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public int removeDuplicates(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int index = 0;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] != nums[index]) {
				index++;
				nums[index] = nums[i];
			}
		}

		return index + 1;
	}
}