package topic.stack;

import java.util.Stack;

public class LC856_括号的分数 {
	public int scoreOfParentheses(String S) {

		Stack<Integer> stack = new Stack<>();
		stack.push(0);

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == '(') {
				stack.push(0);
			} else {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b + Math.max(2 * a, 1));
			}
		}
		return stack.pop();
	}
}
