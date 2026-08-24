package c07_sorting.leetcode;

public class SpecialArrayWithGreaterThanOrEqual {
	public static void main(String[] args) {
		int[] nums = { 3, 5 };
		SpecialArrayWithGreaterThanOrEqual obj = new SpecialArrayWithGreaterThanOrEqual();
		int result = obj.specialArray(nums);
		System.out.println(result);

	}

	public int specialArray(int[] nums) {

		for (int x = 1; x <= nums.length; x++) {

			int count = 0;

			for (int num : nums) {
				if (num >= x) {
					count++;
				}
			}

			if (count == x) {
				return x;
			}
		}

		return -1;
	}

}
