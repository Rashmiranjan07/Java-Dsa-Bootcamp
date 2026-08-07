/*278. find the first bad version
 * ------------------------------

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