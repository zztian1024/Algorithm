package topic.binarytree;

import base.TreeNode;

public class LC112_路径总和 {
	public boolean hasPathSum(TreeNode root, int targetSum) {
		// 为空退出
		if (root == null) {
			return false;
		}
		// 叶子节点判断是否符合
		if (root.left == null && root.right == null) {
			return root.val == targetSum;
		}
		// 求两侧分支的路径和
		return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

	}
}
