package c08_strings.leetcode;

public class ExcelShetColumnNum {
	public static void main(String[] args) {

	}

	public int titleToNumber(String columnTitle) {
		int result = 0;

		for (char ch : columnTitle.toCharArray()) {
			int value = ch - 'A' + 1;
			result = result * 26 + value;
		}

		return result;

	}

}
