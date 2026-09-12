package c08_strings.leetcode;

public class HexadecimalConversion {
	public static void main(String[] args) {
		int num = 26;
		HexadecimalConversion obj = new HexadecimalConversion();
		String result = obj.toHex(num);
		System.out.println(result);
	}

	public String toHex(int num) {
		String hex = Integer.toHexString(num);

		return hex;
	}

}
