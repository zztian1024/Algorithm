package topic.binarytree;

import java.util.ArrayList;
import java.util.List;

import base.TreeNode;

public class LC94_二叉树的中序遍历 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		inorder(root, res);
		return res;
	}

	void inorder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		inorder(root.left, list);
		list.add(root.val);
		inorder(root.right, list);
	}
}
