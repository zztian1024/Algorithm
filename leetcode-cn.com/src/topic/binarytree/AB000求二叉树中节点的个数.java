package topic.binarytree;

import base.TreeNode;

public class AB000求二叉树中节点的个数 {
	int numOfTreeNode(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = numOfTreeNode(root.left);
		int right = numOfTreeNode(root.right);
		return left + right + 1;
	}
}
