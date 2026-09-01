// find out the given number is a power of 2 or not ?

package c12_math.code;

public class PowerOfTwo {
	public static void main(String[] args) {
		int n = 16;
		boolean ans = (n & (n - 1)) == 0;
		System.out.println(ans);
	}

}
