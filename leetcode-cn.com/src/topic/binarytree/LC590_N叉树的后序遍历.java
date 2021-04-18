package topic.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import base.Node;

public class LC590_N叉树的后序遍历 {
	// 递归
	List<Integer> list = new ArrayList<>();

	public List<Integer> postorder(Node root) {
		if (root != null) {
			for (Node child : root.children) {
				postorder(child);
			}
			list.add(root.val);
		}

		return list;
	}

	// 迭代
	public List<Integer> postorder1(Node root) {
		LinkedList<Node> stack = new LinkedList<>();
		LinkedList<Integer> output = new LinkedList<>();
		if (root == null) {
			return output;
		}

		stack.add(root);
		while (!stack.isEmpty()) {
			Node node = stack.pollLast();
			output.addFirst(node.val);
			for (Node item : node.children) {
				if (item != null) {
					stack.add(item);
				}
			}
		}
		return output;
	}

}
