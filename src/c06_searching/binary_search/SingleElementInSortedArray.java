package c06_searching.binary_search;

public class SingleElementInSortedArray {
	public static void main(String[] args) {
		int nums[] = { 1, 1, 2, 2, 3, 4, 4, 8, 8 };

		SingleElementInSortedArray obj = new SingleElementInSortedArray();
		int result = obj.singleNonDuplicate(nums);
		System.out.println(result);

	}

	public int singleNonDuplicate(int[] nums) {
		int start = 0;
		int n = nums.length - 1;
		int end = n;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (n == 1)
				return nums[0];
			if (mid == 0 && nums[0] != nums[1])
				return nums[mid];
			if (mid == n - 1 && nums[n - 1] != nums[n - 2])
				return nums[mid];

			if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]) {
				return nums[mid];
			}

			if (mid % 2 == 0) {
				if (nums[mid - 1] == nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (nums[mid - 1] == nums[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}
}
