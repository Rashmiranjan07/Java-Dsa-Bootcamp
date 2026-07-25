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
