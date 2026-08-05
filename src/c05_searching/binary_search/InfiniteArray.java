/* Find Position of an element in a Sorted array of infinite 
 * ---------------------------------------------------------

 */

package c05_searching.binary_search;

public class InfiniteArray {
	public static void main(String[] args) {

	}

	static int ans(int[] arr, int target) {
		// first find the range
		// first start with a box of size 2
		int start = 0;
		int end = 1;

		// conditon for the target to lie in the range
		while (target > arr[end]) {
			int temp = end + 1;

			// double the box value
			// end = previous end + sizeOfBox*2;
			end = end + (end - start + 1) * 2;
			start = temp;
		}
	}

	static int binarySearch(int[] arr, int target, int start, int end) {

		while (start <= end) {

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
