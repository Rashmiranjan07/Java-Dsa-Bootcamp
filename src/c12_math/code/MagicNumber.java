// find the nth magic number ? ( aksed in amaZon)
// 1= 001 = 5
// 2= 010 =25
// 3=011=30
// 4=100=125
// 5=101=130

package c12_math.code;

public class MagicNumber {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(magicNumber(n));
	}

	static int magicNumber(int n) {
		int ans = 0;
		int base = 5;
		while (n > 0) {
			int last = n & 1; // this will give me last digit of binary form
			n = n >> 1;
			ans += last * base;
			base = base * 5;
		}
		return ans;
	}

}
