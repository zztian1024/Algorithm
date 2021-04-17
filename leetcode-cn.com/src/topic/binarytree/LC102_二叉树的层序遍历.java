package topic.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import base.TreeNode;

public class LC102_二叉树的层序遍历 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null) {
			return res;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root); // 入队
		while (!queue.isEmpty()) {
			List<Integer> level = new ArrayList<Integer>();
			int currentLevelSize = queue.size();
			for (int i = 1; i <= currentLevelSize; ++i) {
				TreeNode node = queue.poll();
				level.add(node.val);
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
			res.add(level);
		}

		return res;
	}
}
