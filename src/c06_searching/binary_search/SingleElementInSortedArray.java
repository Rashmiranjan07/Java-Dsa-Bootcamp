package c06_searching.binary_search;

public class SingleElementInSortedArray {
	public static void main(String[] args) {
		int nums[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };

		SingleElementInSortedArray obj = new SingleElementInSortedArray();
		int result = obj.singleNonDuplicate(nums);
		System.out.println(result);

	}

	public int singleNonDuplicate(int[] nums) {
		int start = 0;
		int end = nums.length;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (end % 2 == 0) {
				if (nums[mid - 1] == nums[mid] && nums[mid] == nums[mid + 1]) {
					return mid;
				} else if (nums[mid - 1] == nums[mid]) {
					end = mid - 1;
				} else if (nums[mid] == nums[mid + 1]) {
					start = mid + 1;
				}
			} else {
				if (nums[mid - 1] == nums[mid] && nums[mid] == nums[mid + 1]) {
					return mid;
				} else if (nums[mid] == nums[mid + 1]) {
					end = mid - 1;
				} else if (nums[mid - 1] == nums[mid]) {
					start = mid + 1;
				}
			}

		}
		return -1;
	}
}
