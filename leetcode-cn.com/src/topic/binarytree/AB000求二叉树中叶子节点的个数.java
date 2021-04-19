package topic.binarytree;

import base.TreeNode;

public class AB000求二叉树中叶子节点的个数 {
	int numsOfNoChildNode(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return numsOfNoChildNode(root.left) + numsOfNoChildNode(root.right);
	}
}
