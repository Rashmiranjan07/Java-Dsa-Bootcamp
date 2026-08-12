/* 4. Median of Two sorted arrays ( Hard)
  ---------------------------------------
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

 */

package c06_searching.binary_search;

import java.util.Arrays;

public class FindMedianSortedArrays {
	public static void main(String[] args) {
		int[] num1 = { 1, 3 };
		int[] num2 = { 2 };
		FindMedianSortedArrays obj = new FindMedianSortedArrays();
		double ans = obj.findMedianSortedArrays(num1, num2);
		System.out.println(ans);

	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length + nums2.length];
		for (int i = 0; i < nums1.length; i++) {
			result[i] = nums1[i];
		}
		for (int i = 0; i < nums2.length; i++) {
			result[nums1.length + i] = nums2[i];
		}

		Arrays.sort(result);
		int n = result.length;
		double median;

		if (n % 2 == 1) {
			median = result[n / 2];
		} else {
			median = (result[n / 2 - 1] + result[n / 2]) / 2.0;
		}
		return median;
	}

}
