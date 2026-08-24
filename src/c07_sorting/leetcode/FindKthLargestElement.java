/*215. Kth Largest Element in an Array (Medium)
-----------------------------------------------
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Can you solve it without sorting?

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

 do not use Cycle sort here 
 */


package c07_sorting.leetcode;

public class FindKthLargestElement {
	public static void main(String[] args) {
		int arr[] = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		FindKthLargestElement obj = new FindKthLargestElement();
		int result = obj.findKthLargest(arr, k);
		System.out.println(result);

	}

	public int findKthLargest(int[] arr, int k) {
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
		return arr[arr.length - k];

	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
