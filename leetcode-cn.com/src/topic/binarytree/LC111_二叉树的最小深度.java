package topic.binarytree;

import base.TreeNode;

public class LC111_二叉树的最小深度 {
	// 递归（深度优先）
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null)
			return 1;
		int min = Integer.MAX_VALUE;
		if (root.left != null)
			min = Math.min(min, minDepth(root.left));
		if (root.right != null)
			min = Math.min(min, minDepth(root.right));
		return min + 1;
	}
}
