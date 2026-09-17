package c05_arrays;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 4, 5, 6 };
		int m = 3;
		int n = 3;
		MergeSortedArray obj = new MergeSortedArray();
		obj.merge(nums1, m, nums2, n);

		// Print merged array
		for (int num : nums1) {
			System.out.print(num + " ");
		}

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1; // Last element of actual nums1
		int j = n - 1; // Last element of nums2
		int k = m + n - 1; // Last position in nums1

		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}

		// Copy remaining elements from nums2
		while (j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}
	}

}
