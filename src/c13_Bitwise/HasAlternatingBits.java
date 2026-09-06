package c13_Bitwise;

public class HasAlternatingBits {
	public static void main(String[] args) {
		int n = 5;
		HasAlternatingBits obj = new HasAlternatingBits();
		boolean result = obj.hasAlternatingBits(n);
		System.out.println(result);
	}

	public boolean hasAlternatingBits(int n) {
		int x = n ^ (n >> 1);

		return (x & (x + 1)) == 0;
	}

}

/*
 * For n = 5:
 *  n = 101
 *  n >> 1 = 010 
 *  n ^ = 111 
 *  Now: 
 *  x = 111 
 *  x + 1 = 1000 
 *  Then:
 * 
 * 0111 
 * & 
 * 1000 
 * ------ 
 * 0000
 * 
 * Therefore: (x & (x + 1)) == 0 is true.
 */
