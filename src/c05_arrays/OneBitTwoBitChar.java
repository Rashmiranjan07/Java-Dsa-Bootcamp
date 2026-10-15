package c05_arrays;

public class OneBitTwoBitChar {
	public static void main(String[] args) {
		int[] bits= {1,1,1,0};
		OneBitTwoBitChar obj 
	}

	public boolean isOneBitCharacter(int[] bits) {
		int i = 0;
		int n = bits.length;

		while (i < n - 1) {
			if (bits[i] == 0) {
				i++;
			} else {
				i += 2;
			}
		}

		return i == n - 1;
	}

}
