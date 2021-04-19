package topic.binarytree;

import base.TreeNode;

public class AB000求二叉树中第k层节点的个数 {
	int numsOfkLevelTreeNode(TreeNode root, int k) {
		if (root == null || k < 1) {
			return 0;
		}
		if (k == 1) {
			return 1;
		}
		int numsLeft = numsOfkLevelTreeNode(root.left, k - 1);
		int numsRight = numsOfkLevelTreeNode(root.right, k - 1);
		return numsLeft + numsRight;
	}
}
