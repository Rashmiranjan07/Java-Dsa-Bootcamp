/*
GCD & LCM 
 -------------
GCD/HCF
------- 
HCF = Highest Common Factor
GCD = Greatest Common Divisor
ex:- (4,18) 
4=1,2,4
18=1,2,3,6,9,18
HCF / GCD = 2
 */
package c12_math.code;

public class GCD_LCM {

	public static void main(String[] args) {

		int x = 4;
		int y = 18;

		int result = hcf(x, y);

		System.out.println("GCD = " + result);
	}

	static int hcf(int x, int y) {

		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}

		return x;
	}
}
