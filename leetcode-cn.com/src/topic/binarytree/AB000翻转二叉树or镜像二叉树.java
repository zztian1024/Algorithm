package topic.binarytree;

import base.TreeNode;

public class AB000翻转二叉树or镜像二叉树 {
	TreeNode mirrorTreeNode(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode left = mirrorTreeNode(root.left);
		TreeNode right = mirrorTreeNode(root.right);
		root.left = right;
		root.right = left;
		return root;
	}
}
