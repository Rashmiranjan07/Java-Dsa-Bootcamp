/* 1356. Sort Integers by The Number of 1 Bits (Easy)
-----------------------------------------------------
You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
Return the array after sorting it.

Example 1:
Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explantion: [0] is the only integer with 0 bits.
[1,2,4,8] all have 1 bit.
[3,5,6] have 2 bits.
[7] has 3 bits.
The sorted array by bits is [0,1,2,4,8,3,5,6,7]

Example 2:
Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
Output: [1,2,4,8,16,32,64,128,256,512,1024]
Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.
 */

package c13_Bitwise;

import java.util.Arrays;

public class SortByBits {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		SortByBits obj = new SortByBits();
		int[] result = obj.sortByBits(arr);
		System.out.println(Arrays.toString(result));
	}

	public int[] sortByBits(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// Count how many 1s are present in the binary representation of arr[i].
				int bits1 = Integer.bitCount(arr[i]);
				// Count how many 2s are present in the binary representation of arr[i].
				int bits2 = Integer.bitCount(arr[j]);
				// Sort by number of 1s
				// If same number of 1s, sort by integer value
				if (bits1 > bits2 || (bits1 == bits2 && arr[i] > arr[j])) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		return arr;
	}
}
