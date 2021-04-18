package topic.binarytree;

import java.util.LinkedList;
import java.util.Queue;

import base.TreeNode;

public class LC104_二叉树的最大深度 {
	// 方法1：递归实现（深度优先）
	class Solution {
		public int maxDepth(TreeNode root) {
			if (root == null)
				return 0;
			int leftH = maxDepth(root.left);
			int rightH = maxDepth(root.right);
			return Math.max(leftH, rightH) + 1;
		}
	}

	// 方法2：广度优先搜索（迭代）
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int ans = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size > 0) {
				TreeNode node = queue.poll();
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
				size--;
			}
			ans++;
		}
		return ans;
	}
}
