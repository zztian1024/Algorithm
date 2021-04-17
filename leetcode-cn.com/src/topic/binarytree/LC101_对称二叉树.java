package topic.binarytree;

import base.TreeNode;

public class LC101_对称二叉树 {
	public boolean isSymmetric(TreeNode root) {
		// 对称，前序
		return validate(root.left, root.right);
	}

	boolean validate(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return validate(root1.left, root2.right) && validate(root1.right, root2.left);
	}
}
