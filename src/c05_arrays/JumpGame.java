package c05_arrays;

public class JumpGame {
	public static void main(String[] args) {

	}

	public boolean canJump(int[] nums) {
		int maxReach = 0;

		for (int i = 0; i < nums.length; i++) {

			// If the current index cannot be reached
			if (i > maxReach) {
				return false;
			}

			// Update the farthest index we can reach
			maxReach = Math.max(maxReach, i + nums[i]);
		}

		return true;
	}

}
