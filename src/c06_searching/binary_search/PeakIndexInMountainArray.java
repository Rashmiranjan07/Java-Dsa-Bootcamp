/* 852. & 162. Peak index in a mountian array 
 * -----------------------------------
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1

 */

package c06_searching.binary_search;

public class PeakIndexInMountainArray {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 2, 1, 0 };
		PeakIndexInMountainArray obj = new PeakIndexInMountainArray();
		int result = obj.peakIndexInMountainArray(arr);
		System.out.println(result);

	}

	public int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				// you are in decreasing part of array
				// this is may be the ans, but look at left
				// this is why end!= mid -1;
				end = mid;
			} else {
				// you are in asc part of array
				start = mid + 1; // bcoz we know that mid+1 element > mid element
			}

		}
// in the end , start == end and pointing to the largest number because of the  2 checks above 
// start and end are always trying to find max element in the above 2 checks
// hence, when they are pointing to just one element, that is the max one because that is ehats the checks say
// more elaboration : at every point of time for start and end , they have the best possible answer till that time & if we are saying that only one item is remaining , hence cuz of above  line is the best possible ans 
		return start; // return end .. both is equal bcoz that is the peak
	}

}
