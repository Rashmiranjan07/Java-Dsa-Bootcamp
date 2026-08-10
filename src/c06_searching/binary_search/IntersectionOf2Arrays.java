/* 349. Intersection of Two arrays
 ----------------------------------
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

 */

package c06_searching.binary_search;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOf2Arrays {
	public static void main(String[] args) {
		int nums1[] = { 1, 2, 2,3, 1 };
		int nums2[] = { 2, 2 ,3};

		IntersectionOf2Arrays obj = new IntersectionOf2Arrays();
		int[] answer = obj.intersection(nums1, nums2);
		System.out.println(Arrays.toString(answer));

	}

	public int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);

		HashSet<Integer> result = new HashSet<>();

		for (int num : nums2) {
			if (binarySearch(nums1, num)) {
				result.add(num);
			}
		}

		int[] answer = new int[result.size()];
		int index = 0;
		for (int num : result) {
			answer[index] = num;
			index++;
		}

		return answer;

	}

	public boolean binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return true;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return false;
	}

}
