package c13_Bitwise;

public class NumberCompliment {
	public static void main(String[] args) {
		int num = 5;
		NumberCompliment obj = new NumberCompliment();
		int result = obj.findComplement(num);
		System.out.println(result);
	}

	public int findComplement(int num) {
		int mask = 0;
		int temp = num;

		while (temp > 0) {
			mask = (mask << 1) | 1;
			temp >>= 1;
		}

		return num ^ mask;
	}

}
