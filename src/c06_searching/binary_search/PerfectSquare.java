/* 367. Valid perfect square :-

 */

package c06_searching.binary_search;

public class PerfectSquare {
	public static void main(String[] args) {
		int num = 16;
		PerfectSquare obj = new PerfectSquare();
		boolean result = obj.isPerfectSquare(num);
		System.out.println(result);

	}

	public boolean isPerfectSquare(int num) {
		int start = 0;
		int end = num;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid * mid == num) {
				return true;
			} else if (mid * mid < num) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}

}
