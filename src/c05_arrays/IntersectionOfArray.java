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