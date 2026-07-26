package c05_arrays;

import java.util.ArrayList;
import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Syntax
		ArrayList<Integer> list = new ArrayList<>(10);
//		
//		list.add(67);
//		list.add(98);
//		
//		System.out.println(list);
//
		// input
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		// get item at any index
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}

		System.out.println(list);
	}

}
