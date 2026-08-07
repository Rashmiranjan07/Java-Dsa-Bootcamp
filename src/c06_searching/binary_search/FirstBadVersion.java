/*278. find the first bad version
 * ------------------------------
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.

Example 2:
Input: n = 1, bad = 1
Output: 1
 */



package c06_searching.binary_search;

public class FirstBadVersion {

}

/*
 * The isBadVersion API is defined in the parent class VersionControl. boolean
 * isBadVersion(int version);
 */

//public class Solution extends FirstBadVersion {
//
//	public int firstBadVersion(int n) {
//
//		// Search range is from version 1 to version n
//		int start = 1;
//		int end = n;
//
//		// Continue until only one version remains
//		while (start < end) {
//
//			// Find the middle version safely
//			int mid = start + (end - start) / 2;
//
//			// If mid is bad, the first bad version is
//			// either mid itself or somewhere before it
//			if (isBadVersion(mid)) {
//				end = mid;
//			}
//			// If mid is good, the first bad version
//			// must be after mid
//			else {
//				start = mid + 1;
//			}
//		}
//
//		// start == end, pointing to the first bad version
//		return start;
//	}
//}