package problemset.interview;

import base.TreeNode;

public class 面试题04_05_合法二叉搜索树 {

	public int lastVal = Integer.MAX_VALUE;
	public boolean firstNode = true;

	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (!isValidBST(root.left)) {
			return false;
		}
		if (!firstNode && lastVal >= root.val) {
			return false;
		}
		firstNode = false;
		lastVal = root.val;
		if (!isValidBST(root.right)) {
			return false;
		}
		return true;
	}
}
