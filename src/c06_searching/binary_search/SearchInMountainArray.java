/*1095. Find in Mountain Array ( hard)
  -----------------------------------
  (This problem is an interactive problem.)
You may recall that an array arr is a mountain array if and only if:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

Example 1:

Input: mountainArr = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

Input: mountainArr = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.
 
 */




package c06_searching.binary_search;

interface MountainArray {
	int get(int index);

	int length();
}

// Local implementation for testing
class MountainArrayImpl implements MountainArray {
	private int[] arr;

	public MountainArrayImpl(int[] arr) {
		this.arr = arr;
	}

	@Override
	public int get(int index) {
		return arr[index];
	}

	@Override
	public int length() {
		return arr.length;
	}
}

// Your LeetCode Solution
class Solution {

	public int findInMountainArray(int target, MountainArray mountainArr) {

		int peak = peakIndexInMountainArray(mountainArr);

		int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);

		if (firstTry != -1) {
			return firstTry;
		}

		return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
	}

	int peakIndexInMountainArray(MountainArray mountainArr) {

		int start = 0;
		int end = mountainArr.length() - 1;

		while (start < end) {

			int mid = start + (end - start) / 2;

			if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}

		return start;
	}

	int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end) {

		boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

		while (start <= end) {

			int mid = start + (end - start) / 2;
			int value = mountainArr.get(mid);

			if (value == target) {
				return mid;
			}

			if (isAsc) {
				if (target < value) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > value) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}

		return -1;
	}
}

// Test class (only for Eclipse)
public class SearchInMountainArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
		int target = 5;

		MountainArray mountainArr = new MountainArrayImpl(arr);

		Solution sol = new Solution();

		int ans = sol.findInMountainArray(target, mountainArr);

		System.out.println("Answer = " + ans);
	}
}