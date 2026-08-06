// Binary search 

package c06_searching.binary_search;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
		int target = 17;
		int ans = binarySearch(arr, target);
		System.out.println(ans);

	}

	// return the index
	// return -1 if it does not exist
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			// find the middle element
			// int mid=(start+end) / 2; // might be possible that exceed the value of
			// Integer
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				// ans found
				return mid;
			}
		}
		return -1;

	}

}

class OrderAgnosticBS {
	public static void main(String[] args) {
		 int[] arr = { 18, 12, 4, 0, -2, -3, -4, -15, -16, -18, -22, -45, -89 };
		//int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };

		int target = 4;

		int ans = orderAgnosticsBS(arr, target);
		System.out.println(ans);
	}

	static int orderAgnosticsBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		// find whether the array is sorted in ascending or descending
		boolean isAsc = arr[start] < arr[end];
//		if(arr[start]<arr[end]) {
//			isAsc=true;
//		} else {
//			isAsc = false;
//		}

		while (start <= end) {
			// find the middle element
			// int mid=(start+end) / 2; // might be possible that exceed the value of
			// Integer
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}
		return -1;
	}
}