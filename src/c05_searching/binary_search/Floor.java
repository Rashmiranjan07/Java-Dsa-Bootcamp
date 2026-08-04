/* Floor Program
 * -------------
 Floor program - find the greatest element which smaller than or equal to the =< target element 
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 15;
 */

package c05_searching.binary_search;

public class Floor {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 19;
		int ans = isFloor(arr, target);
		System.out.println(ans);

	}
     
	//return the index of greatest number <= target
	static int isFloor(int arr[], int target) {

		// but what if the target is greater than the greatest number in the array
		if (target > arr[arr.length - 1]) {
			return -1;
		}

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

				return mid;
			}
		}
		return end;

	}

}
