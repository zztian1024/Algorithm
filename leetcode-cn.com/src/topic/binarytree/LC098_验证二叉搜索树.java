package topic.binarytree;

import base.TreeNode;

public class LC098_验证二叉搜索树 {
	// 递归解法
	public boolean isValidBST(TreeNode root) {
		return validBST(Long.MIN_VALUE, Long.MAX_VALUE, root);
	}

	boolean validBST(long lower, long upper, TreeNode root) {
		if (root == null)
			return true;
		if (root.val <= lower || root.val >= upper)
			return false;
		return validBST(lower, root.val, root.left) && validBST(root.val, upper, root.right);
	}

	// 中序遍历
	private long prev = Long.MIN_VALUE;

	public boolean isValidBST1(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (!isValidBST(root.left)) {
			return false;
		}
		if (root.val <= prev) { // 不满足二叉搜索树条件
			return false;
		}
		prev = root.val;
		return isValidBST(root.right);
	}

}
