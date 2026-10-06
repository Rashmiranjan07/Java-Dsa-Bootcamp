/*350. Intersection of Two Arrays II (Easy)
-------------------------------------------
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

 */


package c05_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfArray {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 21 };
		int[] nums2 = { 2, 2 };

		IntersectionOfArray obj = new IntersectionOfArray();
		int[] result = obj.intersect(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}

	public int[] intersect(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for (int n : nums1) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		for (int n : nums2) {
			if (map.getOrDefault(n, 0) > 0) {
				list.add(n);
				map.put(n, map.get(n) - 1);
			}
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}