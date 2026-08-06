/* Ceiling program 
 ------------------
 * Ceiling : smallest element in array greater or equal = target 
 * Ex:-
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 15;
		output = 5 
		Explanation :- (16) is the smallest element in array whcih is greater than or equal to target 
		
 */

// leetcode- 35 
// https://leetcode.com/problems/search-insert-position/description/

package c06_searching.binary_search;

public class Ceiling {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 15;
		int ans = isCeiling(arr, target);
		System.out.println(ans);

	}

	// return the index of smallest number >=target
	static int isCeiling(int arr[], int target) {

		// but what if the target is greater than the greatest number in the array
		if (target > arr[arr.length - 1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {

				return mid;
			}
		}
		return start;

	}

}
