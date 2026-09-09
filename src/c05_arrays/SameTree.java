/* 100. Same Tree (Easy)
-------------------------
Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true

Example 2:
Input: p = [1,2], q = [1,null,2]
Output: false

Example 3:
Input: p = [1,2,1], q = [1,1,2]
Output: false

 */

package c05_arrays;

public class SameTree {

	// TreeNode class
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	// Check if two trees are the same
	public static boolean isSameTree(TreeNode p, TreeNode q) {

		// Both nodes are null
		if (p == null && q == null) {
			return true;
		}

		// One node is null
		if (p == null || q == null) {
			return false;
		}

		// Values are different
		if (p.val != q.val) {
			return false;
		}

		// Compare left and right subtrees
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

	public static void main(String[] args) {

		// Tree p = [1,2,3]
		TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));

		// Tree q = [1,2,3]
		TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

		System.out.println(isSameTree(p, q));
	}
}