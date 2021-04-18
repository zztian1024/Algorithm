package topic.stack;

import java.util.Stack;

public class LC150_逆波兰表达式求值 {
	boolean isNum(String c) {
		return !(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/"));
	}

	public int evalRPN(String[] tokens) {
		// 创建栈
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for (String t : tokens) {
			if (isNum(t)) {
				stack.push(Integer.parseInt(t));
			} else {
				int a = stack.pop();
				int b = stack.pop();
				switch (t) {
				case "+": {
					stack.push(b + a);
					break;
				}
				case "-": {
					stack.push(b - a);
					break;
				}
				case "*": {
					stack.push(b * a);
					break;
				}
				case "/": {
					stack.push(b / a);
					break;
				}
				}
			}
		}

		return stack.pop();
	}
}
