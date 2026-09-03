/* GCD & LCM 
-------------
GCD/HCF
------- 
HCF = Highest Common Factor
GCD = Greatest Common Divisor
ex:- (4,18) 
4=1,2,4
18=1,2,3,6,9,18
HCF / GCD = 2

Formulae = gcd(a,b) = gcd(rem(b,a)a) {Euclidean algo}

LCM
---
LCM=Least Common Multiple

Formula
LCM = (x × y) / GCD(x, y)


 */
package c12_math.code;

public class GCD_LCM {

	public static void main(String[] args) {

//		int x = 4;
//		int y = 18;
//		int result = gcd1(x, y);
//		System.out.println("GCD = " + result);

		System.out.println(gcd2(4, 9));
		System.out.println(lcm(2, 7));
	}

	static int gcd1(int x, int y) {

		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}

		return x;
	}

	static int gcd2(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd2(b % a, a);
	}

	static int lcm(int a, int b) {
		return a * b / gcd2(a, b);
	}
}
