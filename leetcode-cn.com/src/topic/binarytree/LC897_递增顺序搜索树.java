package topic.binarytree;

import base.TreeNode;

public class LC897_递增顺序搜索树 {
	TreeNode preNode;

	// 缓存中序遍历的前一个节点，将当前左子树拼到它的右子树上
	public TreeNode increasingBST(TreeNode root) {
		TreeNode dummyNode = new TreeNode(-1);
		preNode = dummyNode;
		inorder(root);
		return dummyNode.right;
	}

	void inorder(TreeNode root) {
		if (root == null) {
			return;
		}
		inorder(root.left);

		preNode.right = root;
		root.left = null;
		preNode = root;

		inorder(root.right);
	}
}
