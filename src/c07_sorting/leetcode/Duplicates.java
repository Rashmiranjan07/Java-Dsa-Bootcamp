package c07_sorting.leetcode;

public class Duplicates {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 2 };
		Duplicates obj = new Duplicates();
		boolean result = obj.containsDuplicate(nums);
		System.out.println(result);

	}

	public boolean containsDuplicate(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

}
