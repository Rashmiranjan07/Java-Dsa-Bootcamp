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