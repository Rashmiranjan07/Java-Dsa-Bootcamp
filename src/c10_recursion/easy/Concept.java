/* n-- vs --n
 -------------
1. n-- = pass the value of n and after that substract
2. --n = substract first and then pass the value of n 
 */

package c10_recursion.easy;

public class Concept {
	public static void main(String[] args) {
		concept(5);
	}

	// concept
	static void concept(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
//        concept(n--); 
		concept(--n);
//        n-- vs --n
	}

}
