package c12_math.code;

public class SetIthBit {

	public static void main(String[] args) {

		int n = 86; // 1010110
		int i = 4; // 4th bit

		// 0--->1
		// 1--->0

		System.out.println(toggleBit(n, i));
	}

	static int toggleBit(int n, int i) {

		return n ^ (1 << (i - 1));
	}
}
