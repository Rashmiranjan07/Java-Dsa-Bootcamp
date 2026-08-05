/* Find Position of an element in a Sorted array of infinite 
 * ---------------------------------------------------------

 */


package c05_searching.binary_search;

public class InfiniteArray {
	public static void main(String[] args) {
		
	}
	
	static int ans(int[]arr, int target, int start,int end) {
		// first s
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
