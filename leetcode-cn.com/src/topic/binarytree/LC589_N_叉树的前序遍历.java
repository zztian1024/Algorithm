package topic.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import base.Node;

public class LC589_N_叉树的前序遍历 {
	// 递归
	List<Integer> list = new ArrayList<>();

	public List<Integer> preorder1(Node root) {
		if (root != null) {
			list.add(root.val);
			for (Node child : root.children) {
				preorder(child);
			}
		}
		return list;
	}

	public List<Integer> preorder(Node root) {
		LinkedList<Node> stack = new LinkedList<>();
		LinkedList<Integer> output = new LinkedList<>();
		if (root == null) {
			return output;
		}

		stack.add(root);
		while (!stack.isEmpty()) {
			Node node = stack.pollLast();
			output.add(node.val);
			Collections.reverse(node.children);
			for (Node item : node.children) {
				stack.add(item);
			}
		}
		return output;
	}

}
