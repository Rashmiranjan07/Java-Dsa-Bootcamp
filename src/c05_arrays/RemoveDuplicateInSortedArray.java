package c05_arrays;

public class RemoveDuplicateInSortedArray {
	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
		RemoveDuplicateInSortedArray obj = new RemoveDuplicateInSortedArray();
		int result = obj.removeDuplicates(nums);

	}

	public int removeDuplicates(int[] nums) {
		int i = 0;

		for (int j = 0; j < nums.length; j++) {

			if (i < 2 || nums[j] != nums[i - 2]) {
				nums[i] = nums[j];
				i++;
			}
		}

		return i;
	}

}
