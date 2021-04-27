package topic.binarytree;

import base.TreeNode;

public class LC938_二叉搜索树的范围和 {

	// 中序遍历
	int sum = 0;

	public int rangeSumBST1(TreeNode root, int low, int high) {
		sumBST(root, low, high);
		return sum;
	}

	void sumBST(TreeNode node, int min, int max) {
		if (node == null)
			return;
		sumBST(node.left, min, max);
		if (node.val >= min && node.val <= max)
			sum += node.val;
		sumBST(node.right, min, max);
	}
}
