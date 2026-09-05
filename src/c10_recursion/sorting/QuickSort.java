package c10_recursion.sorting;

public class QuickSort {
	public static void main(String[] args) {

	}

	static void sort(int[] nums, int low, int hi) {
		if (low >= hi) {
			return;
		}

		int s = low;
		int e = hi;
		int m = s + (e - s) / 2;
		int pivot = nums[m];
	}

}
