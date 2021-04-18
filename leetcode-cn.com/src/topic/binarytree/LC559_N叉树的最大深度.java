package topic.binarytree;

import base.Node;

public class LC559_N叉树的最大深度 {
	// 深度优先-递归
	public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		if (root.children.isEmpty()) {
			return 1;
		}
		int max = 0;
		for (Node node : root.children) {
			max = Math.max(maxDepth(node), max);
		}
		return max + 1;
	}
}
