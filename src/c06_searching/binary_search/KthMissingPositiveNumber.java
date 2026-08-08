/* 1539. Kth missing possitive number
  ------------------------------------
 Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.
Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 
 */

package c06_searching.binary_search;

public class KthMissingPositiveNumber {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 7, 11 };
		int k = 5;
		KthMissingPositiveNumber obj = new KthMissingPositiveNumber();
		int result = obj.findKthPositive(arr, k);
		System.out.println(result);
	}

	public int findKthPositive(int[] arr, int k) {
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int missing = arr[mid] - (mid + 1); // Because indexes start from 0, but positive numbers start from 1

			if (missing < k) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return start + k;

	}

}
