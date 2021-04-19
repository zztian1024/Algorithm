package topic.binarytree;

import java.util.ArrayList;
import java.util.List;

import base.TreeNode;

public class LC094_二叉树的中序遍历 {
	private List<Integer> list = new ArrayList<>();

	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null) {
			return list;
		}
		inorderTraversal(root.left);
		list.add(root.val);
		inorderTraversal(root.right);
		return list;
	}

	// -------------------------
	public List<Integer> inorderTraversal2(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		inorder(root, res);
		return res;
	}

	public void inorder(TreeNode root, List<Integer> res) {
		if (root == null) {
			return;
		}
		inorder(root.left, res);
		res.add(root.val);
		inorder(root.right, res);
	}
}
