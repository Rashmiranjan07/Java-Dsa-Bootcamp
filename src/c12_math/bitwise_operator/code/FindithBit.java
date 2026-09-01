package c12_math.bitwise_operator.code;

public class FindithBit {
	public static void main(String[] args) {
		int n = 16;
		int i = 5;
		System.out.println(findBit(n, i));
	}

	static int findBit(int n, int i) {
		return (n & (1 << (i - 1))) != 0 ? 1 : 0;
	}
}