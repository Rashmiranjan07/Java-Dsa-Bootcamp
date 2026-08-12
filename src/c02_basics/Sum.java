package c02_basics;

public class Sum {
//	public static void main(String[] args) {
//		int n = 7;
//		Sum obj = new Sum();
//		int result = obj.sumOfMultiples(n);
//		System.out.println(result);
//
//	}

	public int sumOfMultiples(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				sum += i;
			}
		}

		return sum;
	}

}


