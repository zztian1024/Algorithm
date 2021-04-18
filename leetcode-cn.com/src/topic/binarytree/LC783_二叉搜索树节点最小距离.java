package topic.binarytree;

import base.TreeNode;

public class LC783_二叉搜索树节点最小距离 {
	int pre = -1, res = Integer.MAX_VALUE;;

	public int minDiffInBST(TreeNode root) {
		inorder(root);
		return res;
	}

	// 中序遍历
	void inorder(TreeNode root) {
		if (root == null)
			return;
		inorder(root.left);
		if (pre != -1)
			res = Math.min(res, root.val - pre); // 记录最小值
		pre = root.val;
		inorder(root.right);
	}
}


