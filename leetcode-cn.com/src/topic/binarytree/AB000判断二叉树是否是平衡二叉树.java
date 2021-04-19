package topic.binarytree;

import base.TreeNode;

public class AB000判断二叉树是否是平衡二叉树 {
	boolean isBalanced(TreeNode node) {
		return maxDeath2(node) != -1;
	}

	int maxDeath2(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int left = maxDeath2(node.left);
		int right = maxDeath2(node.right);
		if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
			return -1;
		}
		return Math.max(left, right) + 1;
	}
}
