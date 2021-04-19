package topic.binarytree;

import java.util.LinkedList;
import java.util.Queue;

import base.TreeNode;

public class AB000判断二叉树是否是完全二叉树 {
	boolean isCompleteTreeNode(TreeNode root) {
		if (root == null) {
			return false;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		boolean result = true;
		boolean hasNoChild = false;
		while (!queue.isEmpty()) {
			TreeNode current = queue.remove();
			if (hasNoChild) {
				if (current.left != null || current.right != null) {
					result = false;
					break;
				}
			} else {
				if (current.left != null && current.right != null) {
					queue.add(current.left);
					queue.add(current.right);
				} else if (current.left != null && current.right == null) {
					queue.add(current.left);
					hasNoChild = true;
				} else if (current.left == null && current.right != null) {
					result = false;
					break;
				} else {
					hasNoChild = true;
				}
			}
		}
		return result;
	}
}
