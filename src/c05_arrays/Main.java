package c05_arrays;

import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		arr[0] = 23;
		arr[1] = 45;
		arr[2] = 233;
		arr[3] = 543;
		arr[4] = 3;
		System.out.println(arr[3]);

		// input using for loops
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		System.out.println(Arrays.toString(arr));

		String[] str = new String[4];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}

		System.out.println(Arrays.toString(str));
	}

}

class TwoD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][3];
		System.out.println(arr.length);

		for (int row = 0; row < arr.length; row++) {
			// for each col in every row
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}

		// output
//		for (int row = 0; row < arr.length; row++) {
//			// for each col in every row
//			for (int col = 0; col < arr[row].length; col++) {
//				System.out.print(arr[row][col] + " ");
//			}
//			System.out.println();
//		}
		for (int row = 0; row < arr.length; row++) {
			// for each col in every row
			System.out.print(Arrays.toString(arr[row]));
		}
		System.out.println();
	}
}

class twoDD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6 }, { 7, 8, 9 } };
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}
}
