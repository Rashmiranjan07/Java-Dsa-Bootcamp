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

import javax.swing.tree.TreeNode;

public class SameTree {
	public static void main(String[] args) {
		TreeNode p = { 1, 2, 3 };
		TreeNode q = { 1, 2, 3 };
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
	}

}
