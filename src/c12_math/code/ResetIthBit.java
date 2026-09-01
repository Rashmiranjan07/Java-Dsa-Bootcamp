package c12_math.code;

public class ResetIthBit {

	public static void main(String[] args) {

		int n = 94; // 1011110
		int i = 5; // 5th bit

		System.out.println(resetBit(n, i));
	}

	static int resetBit(int n, int i) {

		return n & ~(1 << (i - 1)); // reset ith bit 
	}
}
